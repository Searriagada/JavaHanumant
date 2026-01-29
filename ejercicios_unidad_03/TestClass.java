
import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {

        //ejercicio01();
        //ejercicio02();
        //ejercicio03();
        //ejercicio04(); 
        //ejercicio05();
        //ejercicio06();
        //ejercicio07();
        //ejercicio08();
        //ejercicio09();
        //ejercicio10();
        //ejercicio11();
        ejercicio12();
    }

    public static void ejercicio01() {
        // 01 Create an Array of booleans of length 3 inside the main method.
        // Print the elements of the array without initializig the array elements explicity.
        boolean[] bool = new boolean[3];
        for (int i = 0; i < bool.length; i++) {
            System.out.println(bool[i]);
        }
    }

    public static void ejercicio02() {
        //dados los arrays imprime el tamño de los tres y también cada elemento de ellos.

        int[] first = new int[3];
        int[] second = {};
        int[] third = null;

        System.out.println(first.length);
        System.out.println(second.length);
        // System.out.println(third.length); // Runtime error, ya que es nulo
        if (third != null) {
            System.out.println(third.length);
        } else {
            System.out.println("third Es nulo, provocará runtime error");
        }

        for (int i = 0; i < first.length; i++) {
            System.out.println("Elemento " + i + " del array first[]");
        }
        for (int i = 0; i < second.length; i++) {
            System.out.println("Elemento " + i + " del array second[]");
        }

        System.out.println("No porque es nulo");

    }

    public static void ejercicio03() {
        //Crear un arrar de chars que contengan 4 valores. Crear una sentencia que involucre un arrar de modo
        // que el primer elemento contenga el segundo, el segundo el del tercero y el tercero el del cuarto.

        char[] pepe = {123, 124, 125, 126};

        for (int i = 0; i < pepe.length - 1; i++) {
            pepe[i] = pepe[i + 1];
        }
        System.out.println(pepe);
    }

    public static void ejercicio04() {
        //Declara e inicializa un array de tamaño 4 tipo String sin usar la palabra New. Imprime el tamño de todos los arreglos incluyendo aquel bidimensional
        String[][] str = {{"a"}, {"a", "b"}, {"a", "b", "c"}, {"a", "b", "c", "d"}};

        for (int i = 0; i < str.length; i++) {
            System.out.println("Posición del array número: " + i + " de longitud: " + str[i].length);
            for (int j = 0; j < str[i].length; j++) {
                System.out.println("Valor: " + str[i][j]);
            }
        }
    }

    public static void ejercicio05() {
        /*
            Given the statement String[][] names = new String[2][3];How many Strings will you need to fill up 
            names completely? Initialize each element of names with a non-null String. Print each of those values 
            one by one without using a loop. Do the same using nested for loops after going through the chapter 
            on loops.
         */
        String[][] names = new String[2][3];

        //Inicializar cada elemento
        names[0][0] = "Seba";
        names[0][1] = "Vivi";
        names[0][2] = "Panchi";
        names[1][0] = "Arriagada";
        names[1][1] = "Munita";
        names[1][2] = "Cea";

        //Imprimi sin loop
        System.out.println("Position [0][0]: " + names[0][0]);
        System.out.println("Position [0][1]: " + names[0][1]);
        System.out.println("Position [0][2]: " + names[0][2]);
        System.out.println("Position [1][0]: " + names[1][0]);
        System.out.println("Position [1][1]: " + names[1][1]);
        System.out.println("Position [1][2]: " + names[1][2]);

        // Imprimir con loop
        int count = 0;
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                names[i][j] = "a";
                count++;
            }
        }

        System.out.println(count);

    }

    public static void ejercicio06() {
        /*
            Define two variables of type arrray of Strings. Initialize them using the elements of the array created in
            the previous exercise
         */
        String[][] names = new String[2][3];
        names[0][0] = "Seba ";
        names[0][1] = "Vivi ";
        names[0][2] = "Panchi";
        names[1][0] = "Arriagada ";
        names[1][1] = "Munita ";
        names[1][2] = "Cea ";

        String[] nombres = names[0];
        String[] apellidos = names[1];

        System.out.println(Arrays.toString(nombres));
        System.out.println(Arrays.toString(apellidos));
    }

    public static void ejercicio07() {
        /*
        Define a simple class named Datawith a public instance field named valueof type int. Create 
        and initialize a Datavariable named din TestClass's main. Create an array of Dataof length 3 
        and initialize each of its elements with the same Datainstance. Use any of the array elements 
        to update the valuefield of the Dataobject. Print out the valuefield of the Dataobject using the 
        three elements of the array. Finally, print the valuefield of the original Datausing the variable d.
         */
        Data d = new Data();
        Data[] data = new Data[3];
        data[0] = d;
        data[1] = d;
        data[2] = d;

        data[1].value = 123;

        System.out.println("Data value: " + data[0].value);
        System.out.println("Data value: " + data[1].value);
        System.out.println("Data value: " + data[2].value);
        System.out.println("Original value: " + d.value);

    }

    static class Data {

        public int value;
    }

    public static void ejercicio08() {
        /*
        Define and initialize an array of array of ints thar resembles a triangular matriz of integers
         */

        int[][] triangular = new int[][]{
            {1},
            {1, 1},
            {1, 1, 1}
        };

        System.out.println(Arrays.deepToString(triangular));
        System.out.println(triangular);
        System.out.println(triangular[0][0]);
        System.out.println(triangular[1][0] + "" + triangular[1][1]);
        System.out.println(triangular[2][0] + "" + triangular[2][1] + "" + triangular[2][2]);

    }

    public static void ejercicio09() {
        /*
     Declare another array of array of ints and initialize it using the elements of the array created in the previous
     exercise in such a way that it resembles and inverted triangular matrix of integer
         */

        int[][] triangular = new int[][]{
            {1},
            {1, 1},
            {1, 1, 1}
        };
        int[][] invertida = new int[][]{
            triangular[2],
            triangular[1],
            triangular[0]
        };
        System.out.println(Arrays.deepToString(invertida));
    }
    
    public static void ejercicio10(){
        /*
        Declare an initialize a variable of type array of Object of length 3.
        Initialize the first element of this array with an array of ints, 
        second with an array of array of ints,
        and third with an array of Object. See if any of the assignments fails compilation.
        */
        
        Object[] obj = new Object[3];
        
        obj[0] = new int[2];
        obj[1] = new int[2][];
        obj[2] = new Object[2];
    }
    
    public static void ejercicio11(){
        /*
        Given the statement int[][]nums=new int[1][3]; how manu int values can nums store?
        Write down how each elements of nums can be addressed
        */
        int[][]nums=new int[1][3];
        
        System.out.println("Total values: "+nums.length * nums[0].length);
        //Cantidad de datos que se pueden direccionar:
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("nums["+i+"]["+j+"]");
            }
        }
        
    }
    
    public static void ejercicio12(){
        /*
        Given the following code:
        
        int[][]nums=new int [1][4][2];
        for(int i = 0;i<nums.length;i++){
            for(int j = 0; j<nums[i].length;j++){
                for(int k = 0; k<nums[i][j].length;k++){
                    nums[i][j][k] = i+j+k;
                       
                }
            }
        }
        */
        int[][][]nums = new int [1][4][2];
        for(int i = 0;i<nums.length;i++){
            for(int j = 0; j<nums[i].length;j++){
                for(int k = 0; k<nums[i][j].length;k++){
                    nums[i][j][k] = i+j+k;
                      System.out.println("num["+i+"]["+j+"]["+k+"] = "+nums[i][j][k]); 
                }
            }
        }
        
    }
}
