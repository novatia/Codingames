import java.util.*;
import java.io.*;
import java.math.*;

abstract class Draw {
    public abstract int getWidth();
    public abstract int getHeight();
    
    public abstract String getRow(int num) throws IndexOutOfBoundsException;
    
    @Override public final String toString() {
        int height = getHeight();
        StringBuilder sb = new StringBuilder();
        
        for (int row = 0; row < height; row++) {
            sb.append(getRow(row)); 
            sb.append('\n');
        }
        
        return sb.toString();
    }
}

abstract class Letter extends Draw {
    private int W;
    private int H;
    
    public void setWidth(int W) {
        this.W = W;    
    }
    
    public void setHeight(int H){
        this.H = H;    
    }
    
    @Override
    public int getWidth() {
        return W;
    }    
    @Override
    public int getHeight() {
        return H;
    }
}

class CustomLetter extends Letter {
    ArrayList<String> rows  = new ArrayList<String>();
    
    public void setRow (String row,int row_num) {
        rows.add(row_num, row);
    }
    
    @Override
    public String getRow(int num) throws IllegalArgumentException {
    
        if (num>=rows.size())
            throw new IndexOutOfBoundsException();
        
        return rows.get(num);
    }
}

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    private static CustomLetter a = new CustomLetter ();
    private static CustomLetter b = new CustomLetter ();
    private static CustomLetter c = new CustomLetter ();
    private static CustomLetter d = new CustomLetter ();
    private static CustomLetter e = new CustomLetter ();
    private static CustomLetter f = new CustomLetter ();
    private static CustomLetter g = new CustomLetter ();
    private static CustomLetter h = new CustomLetter ();
    private static CustomLetter i = new CustomLetter ();
    private static CustomLetter j = new CustomLetter ();
    private static CustomLetter k = new CustomLetter ();
    private static CustomLetter l = new CustomLetter ();
    private static CustomLetter m = new CustomLetter ();
    private static CustomLetter n = new CustomLetter ();
    private static CustomLetter o = new CustomLetter ();
    private static CustomLetter p = new CustomLetter ();
    private static CustomLetter q = new CustomLetter ();
    private static CustomLetter r = new CustomLetter ();
    private static CustomLetter s = new CustomLetter ();
    private static CustomLetter t = new CustomLetter ();
    private static CustomLetter u = new CustomLetter ();
    private static CustomLetter v = new CustomLetter ();
    private static CustomLetter w = new CustomLetter ();
    private static CustomLetter x = new CustomLetter ();
    private static CustomLetter y = new CustomLetter ();
    private static CustomLetter z = new CustomLetter ();
    private static CustomLetter qm= new CustomLetter ();

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int L = in.nextInt();
        int H = in.nextInt();
                
        
        System.err.println(L);
        System.err.println(H);
        
        if ( in.hasNextLine() )  {
            in.nextLine();
        }
        
        String T = in.nextLine();
        System.err.println(T);
     
       //parse letters
        for (int index = 0; index < H; index++) {
            String ROW = in.nextLine();
           
            String[] split_rows= split( ROW, L);
            
            a.setRow(split_rows[0],index);
            b.setRow(split_rows[1],index);
            c.setRow(split_rows[2],index);
            d.setRow(split_rows[3],index);
            e.setRow(split_rows[4],index);
            f.setRow(split_rows[5],index);
            g.setRow(split_rows[6],index);
            h.setRow(split_rows[7],index);
            i.setRow(split_rows[8],index);
            j.setRow(split_rows[9],index);
            k.setRow(split_rows[10],index);
            l.setRow(split_rows[11],index);
            m.setRow(split_rows[12],index);
            n.setRow(split_rows[13],index);
            o.setRow(split_rows[14],index);
            p.setRow(split_rows[15],index);
            q.setRow(split_rows[16],index);
            r.setRow(split_rows[17],index);
            s.setRow(split_rows[18],index);
            t.setRow(split_rows[19],index);
            u.setRow(split_rows[20],index);
            v.setRow(split_rows[21],index);
            w.setRow(split_rows[22],index);
            x.setRow(split_rows[23],index);
            y.setRow(split_rows[24],index);
            z.setRow(split_rows[25],index);
            qm.setRow(split_rows[26],index);
        }
        
         //split T into chars
        char[] phrase = T.toCharArray();
        
           for (int row_index = 0; row_index < H; row_index++ ) {
                 String row_N = "";
         
                 for (int index = 0 ;index < phrase.length; index ++ ) {
                   
                    if (phrase[index] == 'a' || phrase[index]=='A') {
                       row_N  = row_N + a.getRow(row_index);
                    } else if (phrase[index] == 'b' || phrase[index]=='B') {
                       row_N  = row_N + b.getRow(row_index);
                    } else if (phrase[index] == 'c' || phrase[index]=='C') {
                        row_N = row_N + c.getRow(row_index);
                    } else if (phrase[index] == 'd' || phrase[index]=='D') {
                        row_N = row_N + d.getRow(row_index);
                    } else if (phrase[index] == 'e' || phrase[index]=='E') {
                        row_N = row_N + e.getRow(row_index);
                    } else if (phrase[index] == 'f' || phrase[index]=='F') {
                        row_N = row_N + f.getRow(row_index);
                    } else if (phrase[index] == 'g' || phrase[index]=='G') {
                        row_N = row_N + g.getRow(row_index);
                    } else if (phrase[index] == 'h' || phrase[index]=='H') {
                        row_N = row_N + h.getRow(row_index);
                    } else if (phrase[index] == 'i' || phrase[index]=='I') {
                        row_N = row_N + i.getRow(row_index);
                    } else if (phrase[index] == 'j' || phrase[index]=='J') {
                        row_N = row_N + j.getRow(row_index);
                    } else if (phrase[index] == 'k' || phrase[index]=='K') {
                        row_N = row_N + k.getRow(row_index);
                    } else if (phrase[index] == 'l' || phrase[index]=='L') {
                        row_N = row_N + l.getRow(row_index);
                    } else if (phrase[index] == 'm' || phrase[index]=='M') {
                        row_N = row_N + m.getRow(row_index);
                    } else if (phrase[index] == 'n' || phrase[index]=='N') {
                        row_N = row_N + n.getRow(row_index);
                    } else if (phrase[index] == 'o' || phrase[index]=='O') {
                        row_N = row_N + o.getRow(row_index);
                    } else if (phrase[index] == 'p' || phrase[index]=='P') {
                        row_N = row_N + p.getRow(row_index);
                    } else if (phrase[index] == 'q' || phrase[index]=='Q') {
                        row_N = row_N + q.getRow(row_index);
                    } else if (phrase[index] == 'r' || phrase[index]=='R') {
                        row_N = row_N + r.getRow(row_index);
                    } else if (phrase[index] == 's' || phrase[index]=='S') {
                        row_N = row_N + s.getRow(row_index);
                    } else if (phrase[index] == 't' || phrase[index]=='T') {
                        row_N = row_N + t.getRow(row_index);
                    } else if (phrase[index] == 'u' || phrase[index]=='U') {
                        row_N = row_N + u.getRow(row_index);
                    } else if (phrase[index] == 'v' || phrase[index]=='V') {
                        row_N = row_N + v.getRow(row_index);
                    } else if (phrase[index] == 'w' || phrase[index]=='W') {
                        row_N = row_N + w.getRow(row_index);
                    } else if (phrase[index] == 'x' || phrase[index]=='X') {
                        row_N = row_N + x.getRow(row_index);
                    } else if (phrase[index] == 'y' || phrase[index]=='Y') {
                        row_N = row_N + y.getRow(row_index);
                    } else if (phrase[index] == 'z' || phrase[index]=='Z') {
                        row_N = row_N + z.getRow(row_index);
                    } else  {
                        row_N = row_N + qm.getRow(row_index);
                    }
                }
                
                System.out.println(row_N);
            }

    }

    private static String[] split(String src, int len) {
        String[] result = new String[(int)Math.ceil((double)src.length()/(double)len)];
        for (int i=0; i<result.length; i++)
            result[i] = src.substring(i*len, Math.min(src.length(), (i+1)*len));
        return result;
    }   
}



class A extends Letter {
    
    
    @Override
    public String getRow(int num) throws IllegalArgumentException {
    
        switch (num) {
            case 0:
                return " # ";
            case 1:
                return "# #";
            case 2: 
                return "###";
            case 3: 
                return "# #";
            case 4: 
                return "# #";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}

class B extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "## ";
            case 1:
                return "# #";
            case 2: 
                return "## ";
            case 3: 
                return "# #";
            case 4: 
                return "## ";
            
            default: throw new IndexOutOfBoundsException();
        }
    }
}

class D extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "## ";
            case 1:
                return "# #";
            case 2: 
                return "# #";
            case 3: 
                return "# #";
            case 4: 
                return "## ";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}

class E extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "###";
            case 1:
                return "#  ";
            case 2: 
                return "###";
            case 3: 
                return "#  ";
            case 4: 
                return "###";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}

class F extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "###";
            case 1:
                return "#  ";
            case 2: 
                return "###";
            case 3: 
                return "#  ";
            case 4: 
                return "#  ";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}

class G extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return " ##";
            case 1:
                return "#  ";
            case 2: 
                return "# #";
            case 3: 
                return "# #";
            case 4: 
                return " ##";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}

class H extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "# #";
            case 1:
                return "# #";
            case 2: 
                return "###";
            case 3: 
                return "# #";
            case 4: 
                return "# #";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}

class I extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "###";
            case 1:
                return " # ";
            case 2: 
                return " # ";
            case 3: 
                return " # ";
            case 4: 
                return "###";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}

class J extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return " ##";
            case 1:
                return "  #";
            case 2: 
                return "  #";
            case 3: 
                return "# #";
            case 4: 
                return " # ";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}

class K extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "# #";
            case 1:
                return "# #";
            case 2: 
                return "## ";
            case 3: 
                return "# #";
            case 4: 
                return "# #";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}

class L extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "# ";
            case 1:
                return "#  ";
            case 2: 
                return "#  ";
            case 3: 
                return "#  ";
            case 4: 
                return "###";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}
class M extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "# #";
            case 1:
                return "###";
            case 2: 
                return "###";
            case 3: 
                return "# #";
            case 4: 
                return "# #";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}
class N extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "###";
            case 1:
                return "# #";
            case 2: 
                return "# #";
            case 3: 
                return "# #";
            case 4: 
                return "# #";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}
class O extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return " # ";
            case 1:
                return "# #";
            case 2: 
                return "# #";
            case 3: 
                return "# #";
            case 4: 
                return " # ";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}
class P extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "## ";
            case 1:
                return "# #";
            case 2: 
                return "## ";
            case 3: 
                return "#  ";
            case 4: 
                return "#  ";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}
class Q extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return " # ";
            case 1:
                return "# #";
            case 2: 
                return "# #";
            case 3: 
                return " ##";
            case 4: 
                return "  #";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}
class R extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "## ";
            case 1:
                return "# #";
            case 2: 
                return "## ";
            case 3: 
                return "# #";
            case 4: 
                return "# #";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}
class S extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return " ##";
            case 1:
                return "#  ";
            case 2: 
                return " # ";
            case 3: 
                return "  #";
            case 4: 
                return "## ";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}
class T extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "###";
            case 1:
                return " # ";
            case 2: 
                return " # ";
            case 3: 
                return " # ";
            case 4: 
                return " # ";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}

class U extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "# #";
            case 1:
                return "# #";
            case 2: 
                return "# #";
            case 3: 
                return "# #";
            case 4: 
                return "###";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}

class V extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "# #";
            case 1:
                return "# #";
            case 2: 
                return "# #";
            case 3: 
                return "# #";
            case 4: 
                return " # ";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}

class W extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "# #";
            case 1:
                return "# #";
            case 2: 
                return "###";
            case 3: 
                return "###";
            case 4: 
                return "# # ";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}

class X extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "# #";
            case 1:
                return "# #";
            case 2: 
                return " # ";
            case 3: 
                return "# #";
            case 4: 
                return "# #";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}

class Y extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "# #";
            case 1:
                return "# #";
            case 2: 
                return " # ";
            case 3: 
                return " # ";
            case 4: 
                return " # ";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}

class Z extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "###";
            case 1:
                return "  #";
            case 2: 
                return " # ";
            case 3: 
                return "#  ";
            case 4: 
                return "###";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}

class QM extends Letter {
    @Override
    public String getRow(int num) throws IllegalArgumentException {
        switch (num) {
            case 0:
                return "###";
            case 1:
                return "  #";
            case 2: 
                return " ##";
            case 3: 
                return "   ";
            case 4: 
                return " # ";
                
            default: throw new IndexOutOfBoundsException();
        }
    }
}
