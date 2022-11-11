import java.util.*;
public class antonAndPolyhedronsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int faces = 0;
        for(int i = 0; i < n; i++){
            String s = in.next();
            if(s.equals("Tetrahedron"))
                faces += 4;
            else if(s.equals("Cube"))
                faces += 6;
            else if(s.equals("Octahedron"))
                faces += 8;
            else if(s.equals("Dodecahedron"))
                faces += 12;
            else if(s.equals("Icosahedron"))
                faces += 20;
        }
        System.out.println(faces);
        in.close();
    }
}
