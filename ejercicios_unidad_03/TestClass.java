public class TestClass {
    public static void main(String[] args){
        
        //ejercicio01();
        //ejercicio02();
        //ejercicio03();
        ejercicio04();
    }
    
    public static void ejercicio01(){
       // 01 Create an Array of booleans of length 3 inside the main method.
       // Print the elements of the array without initializig the array elements explicity.
       boolean[] bool = new boolean[3];
        for (int i = 0; i < bool.length; i++) {
            System.out.println(bool[i]);
        }
    }    
    public static void ejercicio02(){
        //dados los arrays imprime el tamño de los tres y también cada elemento de ellos.
        
        int[] first = new int[3];
        int[] second = {};
        int[] third = null;
        
        System.out.println(first.length);
        System.out.println(second.length);
        // System.out.println(third.length); // Runtime error, ya que es nulo
        if(third != null){
            System.out.println(third.length);
        }else{
            System.out.println("third Es nulo, provocará runtime error");
        }
        
        for(int i = 0; i < first.length; i++){
            System.out.println("Elemento " + i + " del array first[]" );
        }
        for(int i = 0; i < second.length; i++){
            System.out.println("Elemento " + i + " del array second[]" );
        }
  
        System.out.println("No porque es nulo");

    }
    
    public static void ejercicio03(){
        //Crear un arrar de chars que contengan 4 valores. Crear una sentencia que involucre un arrar de modo
        // que el primer elemento contenga el segundo, el segundo el del tercero y el tercero el del cuarto.
        
        char[] pepe = {123,124,125,126};
        
        for(int i = 0; i < pepe.length-1; i++){
            pepe[i] = pepe[i+1];
        }
        System.out.println(pepe);
    }
    
        public static void ejercicio04(){
            //Declara e inicializa un array de tamaño 4 tipo String sin usar la palabra New. Imprime el tamño de todos los arreglos incluyendo aquel bidimensional
            String[][] str = {{"a"},{"a","b"},{"a","b","c"},{"a","b","c","d"}};

            for (int i = 0; i < str.length; i++){
                System.out.println("Posición del array número: "+i+" de longitud: "+str[i].length);
                for(int j = 0; j < str[i].length;j++){
                    System.out.println("Valor: "+str[i][j]);
                }
            }
        }
    
}
