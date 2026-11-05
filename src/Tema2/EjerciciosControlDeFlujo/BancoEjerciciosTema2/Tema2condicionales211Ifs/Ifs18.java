/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten
 en el curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación
 obtenida. Pásale el minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal andan de
 conocimientos en las diferentes asignaturas del curso.
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////





package Tema2.EjerciciosControlDeFlujo.BancoEjerciciosTema2.Tema2condicionales211Ifs;
import java.util.Scanner;
public class Ifs18 {
    public static void main(String[]args){

        System.out.println("");
        System.out.println("");
        System.out.println("***************************************************************************");
        System.out.println("*************************** ______________ *********************************");
        System.out.println("************************** /              \\ ********************************");
        System.out.println("************************* /                \\ *******************************");
        System.out.println("************************ / MINICUESTIONARIO \\ ******************************");
        System.out.println("************************ \\                  / ******************************");
        System.out.println("************************* \\                / *******************************");
        System.out.println("************************** \\              / ********************************");
        System.out.println("**************************** ¯¯¯¯¯¯¯¯¯¯¯¯¯ **********************************");
        System.out.println("");
        System.out.println("");
        System.out.println("Responde a estas 10 preguntas:");
        System.out.println("");
        System.out.println("1. ¿Cuál de los siguientes tipos de error es el más peligroso debido" +
                " a que el programa compila y se ejecuta sin lanzar avisos, pero produce un resultado incorrecto?\n" +
                "A) Error de sintaxis.\n" +
                "B) Error de ejecución.\n" +
                "C) Error de lógica.\n" +
                "D) Error de compilación.");
            Scanner sc = new Scanner(System.in);
            String respuesta1 = sc.nextLine();

        System.out.println("2.¿Qué tipo de traductor convierte" +
                " todo el código fuente de una vez a código máquina, generando un " +
                "archivo ejecutable antes de la ejecución?\n" +
                "A) Intérprete\n" +
                "B) Compilador\n" +
                "C) Máquina Virtual (JVM)\n" +
                "D) Recolector de basura ");
             String respuesta2 = sc.nextLine();

        System.out.println("3. ¿Qué paquete o componente del entorno Java contiene las herramientas " +
                "necesarias para desarrollar y compilar programas, incluyendo el comando javac?\n" +
                "A) JVM\n" +
                "B) JRE\n" +
                "C) JDK\n" +
                "D) API");
             String respuesta3 = sc.nextLine();
        System.out.println("4. ¿Cuál es la forma correcta y fiable de comprobar si el contenido de una " +
                "variable String llamada texto es exactamente igual a \"hola\"?.\n" +
                "A) texto == \"hola\".\n" +
                "B) texto.equals(\"hola\").\n" +
                "C) texto.is(\"hola\").\n" +
                "D) texto = \"hola\".");
                //para que se vean las comillas dobles de pone \ la barra invertida y las comillas \"sggfg\"
             String respuesta4 = sc.nextLine();

        System.out.println("5. Al utilizar la clase Scanner, ¿en qué situación se produce el \"problema del" +
                " buffer\" que requiere una lectura de limpieza con nextLine()?\n" +
                "A) Al leer un número (nextInt() o nextDouble()) y a continuación querer leer una línea completa " +
                "con nextLine().\n" +
                "B) Al leer dos cadenas de texto seguidas usando nextLine().\n"+
                "C) Al utilizar printf en lugar de println.\n" +
                "D) Al leer caracteres individuales con next().\n");
             String respuesta5 = sc.nextLine();

        System.out.println("6. ¿Cuál fue la aportación fundamental de John Von Neumann en 1946 a la " +
                "arquitectura de los ordenadores modernos?.\n" +
                "A) Diseñar el primer microprocesador de varios núcleos.\n" +
                "B) Construir un ordenador que utilizaba el mismo dispositivo de almacenamiento " +
                "para instrucciones y datos (programa almacenado).\n" +
                "C) Crear el lenguaje de programación ensamblador.\n" +
                "D) Inventar la memoria caché L1 encapsulada en el núcleo");
            String respuesta6 = sc.nextLine();
        System.out.println("7. ¿Por qué la tecnología Blu-ray alcanza una densidad de almacenamiento mucho mayor" +
                " (25 GB por capa) que el DVD convencional (4,7 GB)?\n" +
                "A) Porque aumenta la velocidad de rotación a 100.000 RPM.\n" +
                "B) Porque utiliza celdas de almacenamiento magnético en lugar de marcas ópticas.\n" +
                "C) Porque los discos de Blu-ray miden el doble de diámetro que los DVD.\n" +
                "D) Porque sustituye el láser rojo por un láser azul de longitud de onda más" +
                "corta, obteniendo \"puntos\" más pequeños.");
            String respuesta7 = sc.nextLine();


        System.out.println("8.¿Cuál es la terna tridimensional de coordenadas que se utiliza para direccionar " +
                "físicamente la información en un disco duro magnético (HDD)?.\n" +
                "A) Bloque, Pista y Bit.\n" +
                "B) Cilindro, Cabeza y Sector.\n" +
                "C) Plato, Brazo y Caché.\n" +
                "D) Voltaje, Frecuencia y Latencia.");
            String respuesta8 = sc.nextLine();

        System.out.println("9. En una relación de generalización/especialización del modelo E/R, ¿qué tipo de" +
                " interrelación se establece entre los subtipos y el supertipo?.\n" +
                "A) Interrelación de tipo \"TIENE\".\n" +
                "B) Interrelación de tipo \"ES_UN\".\n" +
                "C) Interrelación n-aria." +
                "D) Interrelación reflexiva");

             String respuesta9 = sc.nextLine();
        System.out.println("10. ¿Cuál de las siguientes NO es una de las tres funciones principales que realiza " +
                "un Sistema de Gestión de Bases de Datos (SGBD)?.\n" +
                "A) Funciones de definición de datos.\n" +
                "B) Funciones de manipulación de datos.\n" +
                "C) Funciones de compactación física de ficheros." +
                "D) Funciones de control de datos");

             String respuesta10 = sc.nextLine();



        int correctas = 0;
        /*String fallo1 = "",
               fallo2 = "",
               fallo3 = "",
               fallo4 = "",
               fallo5 = "",
               fallo6 = "",
               fallo7 = "",
               fallo8 = "",
               fallo9 = "",
               fallo10 = ""; Esto me sobra*/

        if(respuesta1.equalsIgnoreCase("c")){
           correctas++;
        }else{
            System.out.println("Pregunta 1.RESPUESTA CORRECTA (C)Justificación: El error de lógica es el más peligroso porque ni " +
                    "el compilador ni el entorno de ejecución lanzan una alerta de fallo.\n" +
                    "El programa se ejecuta normalmente, pero produce un resultado equivocado" +
                    " debido a un defecto en el razonamiento del programador (por ejemplo, errar" +
                    " en la fórmula de una media).\n");
        }
        if(respuesta2.equalsIgnoreCase("b")){
            correctas++;
        }else{
            System.out.println("Pregunta 2.RESPUESTA CORRECTA (B). Justificación: Un compilador traduce todo el código fuente en bloque " +
                    "antes de ejecutar y crea un ejecutable.\n" +
                    "Por contra, un intérprete lee y ejecuta el código instrucción a instrucción en tiempo real.\n");
        }
        if(respuesta3.equalsIgnoreCase("c")){
            correctas++;
        }else{
            System.out.println("Pregunta 3.RESPUESTA CORRECTA (C).Justificación: El JDK (Java Development Kit) incluye el entorno JRE junto con " +
                    "las herramientas de desarrollo como el compilador javac.\n" +
                    "El JRE por sí solo solo permite ejecutar programas previamente construidos.\n");
        }
        if(respuesta4.equalsIgnoreCase("b")){
            correctas++;
        }else{
            System.out.println("Pregunta 4.RESPUESTA CORRECTA (B).Justificación: En los tipos de objeto como String, el operador == no " +
                    "compara el texto contenido sino las direcciones de memoria.\n" +
                    "Para verificar que la secuencia de caracteres sea idéntica debe emplearse el método .equals().\n");
        }

        if(respuesta5.equalsIgnoreCase("a")){
            correctas++;
        }else{
            System.out.println("Pregunta 5.RESPUESTA CORRECTA (A).Justificación: Los métodos numéricos como nextInt() leen el dato pero " +
                    "no consumen el salto de línea (\\n o Intro) que queda pendiente en el buffer.\n" +
                    "Si a continuación se invoca nextLine(), este se lee la marca \\n pendiente y devuelve una" +
                    " cadena vacía de forma transparente.\n");
        }
        if(respuesta6.equalsIgnoreCase("b")){
            correctas++;
        }else{
            System.out.println("Pregunta 6.RESPUESTA CORRECTA (B).Justificación: La idea clave de Von Neumann consistió en almacenar " +
                    "permanentemente tanto las instrucciones como los datos en una misma memoria principal," +
                    " superando los modelos cableados anteriores.\n");
        }

        if(respuesta7.equalsIgnoreCase("d")){
            correctas++;
        }else{
            System.out.println("Pregunta 7.RESPUESTA CORRECTA (D).Justificación: El estándar Blu-ray utiliza un láser azul de longitud " +
                    "de onda más corta que el láser rojo tradicional del DVD, lo que permite enfocar sobre surcos" +
                    " más estrechos y marcas (puntos) considerablemente más pequeñas.\n");
        }
        if(respuesta8.equalsIgnoreCase("b")){
            correctas++;
        }else{
            System.out.println("Pregunta 8.RESPUESTA CORRECTA (C).Justificación: El acceso a la información en un disco duro magnético " +
                    "requiere seleccionar el cilindro deseado, la cabeza/pista adecuada y el sector correspondiente " +
                    "dentro de ella.\n");
        }
        if(respuesta9.equalsIgnoreCase("b")){
            correctas++;
        }else{
            System.out.println("Pregunta 9.RESPUESTA CORRECTA (B).Justificación: Los subtipos se conectan con el supertipo a través de" +
                    " la relación \"ES_UN\", lo que implica que cada ejemplar del subtipo pertenece también" +
                    " al supertipo.\n");
        }
        if(respuesta10.equalsIgnoreCase("c")){
            correctas++;
        }else{
            System.out.println("Pregunta 10. RESPUESTA CORRECTA (C).Justificación: Las tres funciones principales que debe llevar a cabo" +
                    " un SGBD son las de definición, manipulación y control de datos.\n");
        }


        System.out.printf("Con %d respuestas correctas ---> calificación %d",correctas,correctas);


        //1c,2b,3c,4b,5a,6b,7d,8b,9b,10c





    }
}
