import java.util.*;
import java.io.*;
import java.math.*;


class Player {
    static double STEP_LOW       = 0.5;
    static double STEP_HIGH      = 0.75;
    static double STEP_VERY_HIGH = 0.85;
    
    static double X_factor = 0;
    static double Y_factor = 0;
   
    static int W;
    static int H;
    static int N;
    
    static int XH=0;
    static int XL=0;

    static int YH=0;
    static int YL=0;
    
    static int XA=0;
    static int YA=0;
    
    static int X0,Y0,X1,Y1,X_1=-1,Y_1=-1,X_2=-1,Y_2=-1;
    
    static int X_step,Y_step;
    
    static String bombDir;
    static String old_bombDir ="";

    static Boolean up;
    static Boolean down;
    static Boolean left;
    static Boolean right;

    static int X_grad = 0;
    static int Y_grad = 0;
    
   
    private static int multiply (int value, double factor) {
           Double d = new Double(value);
           d = d*factor;
            
           int new_value = d.intValue();
   
           return new_value;
    }
    
    static Boolean X_changed = false;
    static Boolean Y_changed = false;
    static Boolean X_resonance = false;
    static Boolean X_pre_resonance = false;
    static Boolean Y_resonance = false;
    static Boolean Y_pre_resonance = false;

    private static void updateBombArea () {
          
            if ( X_grad == 0 ) {
                if (X0>XA){
                    X_grad = -1;
                } else {
                    X_grad = 1;
                }
            }
            
            if ( Y_grad == 0 ) {                
                if (Y0>YA){
                    Y_grad = -1;
                } else {
                    Y_grad = 1;
                }
            }
          
            if (up && old_bombDir.contains("U") ) {
                YH=Y_1; 
            }

            if (down && old_bombDir.contains("D") ) {
                YL=Y_1; 
            }
            
            if (up && old_bombDir.contains("D")){
      
                YH=Y_1;
            }

            if (down && old_bombDir.contains("U")) {
               
                YL=Y_1;
            }
           
           
            if (left && old_bombDir.contains("L") ) {
                XH=X_1; 
            }
            
            if (left && old_bombDir.contains("R")) {
              
                XH=X_1;
            }
            
            if (right && old_bombDir.contains("R") ) {
                XL=X_1; 
            }
            
            if (right && old_bombDir.contains("L")) {
              
                XL=X_1; 
            }
           
            double B      = 0; 
            double A_LOW  = 0.52; 
            double A_HIGH = 1.1; 
                
            if (W>5000)
                B=0.00;
                
            if (X_changed)
                X_factor =X_factor*A_LOW+B;
            else 
                X_factor = X_factor*A_HIGH+B;
                    
            if (Y_changed)
                Y_factor =Y_factor*A_LOW+B;
            else 
                Y_factor = Y_factor*A_HIGH+B;
           
           
           if (X_resonance)
                X_factor = (X_factor*0.5);
    
            if (Y_resonance)
                Y_factor = (Y_factor*0.5);
          
           
            if (X_factor<0.1)
                X_factor= 0.1;
            if (Y_factor<0.1)
                Y_factor= 0.1;
            
            if (W>5000)
                if (X_factor<0.4275)
                    X_factor= 0.4275;
            
            if (W>5000)
                if (Y_factor<0.4275)
                    Y_factor= 0.4275;
            
            X_step = multiply(XH-XL, X_factor);
            Y_step = multiply(YH-YL, Y_factor);
            
            
             
            if (X_step<=0)
                X_step = 1;
          
            if (Y_step<=0)
                Y_step = 1;
          
          
            System.err.println("X_Step: "+X_step+", Y_Step: "+Y_step + " factor: ("+X_factor+","+Y_factor+")");
            System.err.println("Bomb is predicted to be in: ("+XL+"<=X<="+XH+"),("+YL+"<=Y<="+YH+")");
    }
    
    static void readInput( Scanner in ) {
            bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            
            up    = false;
            down  = false;
            left  = false;
            right = false;

            System.err.println("Old movement:"+old_bombDir);
            System.err.println("New movement:"+bombDir);
            
            if ( bombDir.contains("U") ) {
                up = true;
            } 
            
            if ( bombDir.contains("D") ) {
                down = true;
            }
            
            if ( bombDir.contains("R") ) {
                right = true;
            } 
            
            if ( bombDir.contains("L") ) {
                left = true;
            }
            
            Boolean old_up=false;
            Boolean old_down=false;
            Boolean old_left=false;
            Boolean old_right=false;

            if ( old_bombDir.contains("U") ) {
                 old_up = true;
            } 
            
            if ( old_bombDir.contains("D") ) {
                old_down = true;
            }
            
            if ( old_bombDir.contains("R") ) {
                  old_right = true;
            } 
            
            if ( old_bombDir.contains("L") ) {
                 old_left = true;
            }
           
                Y_changed = ( (old_up && !up ) || (!old_up && up) ) || ( (!old_down && down) || (old_down && !down) );
                X_changed = ((!old_left && left) || (old_left && !left)) || ((old_right && !right) || (!old_right && right));
                
                if (X_changed){
                    if (X_pre_resonance) {
                        X_resonance = true;
                    } else {
                     X_pre_resonance = true;
                    }
                } else {
                    X_pre_resonance = false;
                    X_resonance = false;
                }
               if (Y_changed){
                    if (Y_pre_resonance) {
                        Y_resonance = true;
                    } else {
                     Y_pre_resonance = true;
                    }
                } else {
                    Y_pre_resonance = false;
                    Y_resonance = false;
                }
                    
        
            if (Y_changed)
                System.err.println("Y Changed");
               
            if (X_changed)
                System.err.println("X Changed");
                
                
            if (Y_resonance)
                System.err.println("Y Resonate");
               
            if (X_resonance)
                System.err.println("X Resonate");
                
            if (old_bombDir == "")
                old_bombDir = bombDir;
        
    }
    
    static void calculateNewCoord(){
         
            
            //update coord for OUTPUT.
            if (up)
                Y1 = Y1-Y_step;
            
            if (down)
                Y1 = Y1+Y_step;
            
            if (left)
                X1 = X1-X_step;
                
            if (right)
                X1 = X1+X_step;
            
            if (X1>=W)
                X1=W-1;
                
            if (X1<=0)
                X1=0;
           
            if (Y1>=H) {
                Y1=H-1;
            }
            
            if (Y1<=0) {
                Y1=0;
            }
            
            if (X1>XH)
                X1 = XH-1;
                
             if (X1<XL)
                X1 = XL-1;
            
             if (Y1>YH)
                Y1 = YH-1;
                
             if (Y1<YL)
                Y1 = YL-1;
           
           
           
            System.err.println("Old coord: ("+X_1+","+Y_1+")");
            System.err.println("New coord: ("+X1+","+Y1+")");
    }

    public static void main( String args[] ) {
        Scanner in = new Scanner(System.in);
        W = in.nextInt(); // width of the building.
        H = in.nextInt(); // height of the building.
        N = in.nextInt(); // maximum number of turns before game over.
        X0 = in.nextInt();
        Y0 = in.nextInt();

        //INIT STATE VARS
        XH=W-1;
        YH=H-1;
       
        X_1=X0;
        Y_1=Y0;
        
        X1=X0;
        Y1=Y0;
        
        XA = multiply(W,0.5);
        YA = multiply(H,0.5);
        
        X_factor = 1;
        Y_factor = 1;
        
       
        System.err.println("W:"+W+", H:"+H);
        System.err.println("Start ("+X0+","+Y0+") "+ N + " turns");
       
        // game loop
        while (true) {
            
            //read input
            readInput(in);
            
            
            
            //update bomb prediction
            updateBombArea();
            
            //calculate next coordinate
            calculateNewCoord();
            
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            // the location of the next window Batman should jump to.
            System.out.println(X1+" "+Y1);
          
            //STORE OLD STATE.
           
            X_2=X_1;
            Y_2=Y_1;
            
            X_1=X1;
            Y_1=Y1;
           
            old_bombDir = bombDir;
            
            N--;
        }
    }
}