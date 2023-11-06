import java.util.InputMismatchException;
import java.util.Scanner;


public class CuerposGeometricos {
    public static void main(String[] args)throws Exception  {
             Scanner lector=new Scanner(System.in);
             int x=calcular();
              int opcion = 0;
            
              
        do {
            System.out.println("Seleccione una figura geometrica:");
            System.out.println("1. Piramide");
            System.out.println("2. Cilindro");
            System.out.println("3. Cono");
            System.out.println("4. Esfera");
            System.out.println("5. Zona esferica");
            System.out.println("6. Casquete esferico");
            System.out.println("7. Cuña esferica");
            System.out.println("8. Ortodero");
            System.out.println("9. Tetraedro");
            System.out.println("10. Hexaedro");
            System.out.println("11. Octaedro");
            System.out.println("12. Dodecaedro");
            System.out.println("13. Icosaedro");
            System.out.println("14. Tronco de cono");
            System.out.println("15. Tronco de piramide");
            System.out.println("16. Dodecaedro");
            System.out.println("17. Icosaedro");
            System.out.println("18. Tronco de cono");
            System.out.println("19. Tronco de piramide");
            System.out.println("20. Prisma ");
            System.out.println("21. Salir");
            opcion = scanner.nextInt();
           
    try {
        
      switch (opcion) {
                case 1:
                    calcularVolumenPiramide();
                    break;
                case 2:
                    calcularVolumenCilindro();
                    break;
                case 3:
                    calcularVolumenCono();
                    break;
                case 4:
                    calcularVolumenEsfera();
                    break;

                 case 5:
                    calcularAreaZonaEsferica();
                    break;
                case 6:
                    calcularVolumenCasqueteEsferico();
                    break;
                case 7:
                    calcularVolumenCunaEsferica();
                    break;
                case 8:
                    calcularVolumenOrtoedro();
                    break;
                case 9:
                    calcularVolumenTetraedro();
                    break;
                case 10:
                    calcularVolumenHexaedro();
                    break;
                case 11:
                    calcularVolumenOctaedro();
                    break;
                case 12:
                    calcularVolumenDodecaedro();
                    break;
                case 13:
                    calcularVolumenIcosaedro();
                    break;
                case 14:
                    calcularVolumenTroncoCono();
                    break;
                case 15:
                    calcularVolumenTroncoPiramide();
                    break;
                
                case 16:
                    calcularVolumenDodecaedro();
                    break;
                case 17:
                    calcularVolumenIcosaedro();
                    break;
                case 18:
                    calcularVolumenTroncoCono();
                    break;
                case 19:
                    calcularVolumenTroncoPiramide();
                    break;
                 
               case 20:
                    calcularAreaPrima();
                    break;
                
                case 21:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
    }    catch (InputMismatchException e) {
        System.out.println("Por favor, ingrese un número válido.");
        scanner.next();
    }
        
        } while (opcion != 21);
    }



public static void calcularVolumenPiramide() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la base de la piramide:");
        double base = input.nextDouble();
        System.out.println("Ingrese la altura de la piramide:");
        double altura = input.nextDouble();
        if (base > 0 && altura > 0) {
            double volumen = (base * base * altura) / 3;
            System.out.println("El volumen de la piramide es: " + volumen);
        } else {
            System.out.println("Las dimensiones deben ser numeros positivos");
        }

         return numero;
    }


    public static void calcularVolumenCilindro() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio del cilindro:");
        double radio = input.nextDouble();
        System.out.println("Ingrese la altura del cilindro:");
        double altura = input.nextDouble();
        if (radio > 0 && altura > 0) {
            double volumen = Math.PI * Math.pow(radio, 2) * altura;
            System.out.println("El volumen del cilindro es: " + volumen);
        } else {
            System.out.println("Las dimensiones deben ser numeros positivos");
        }

         return numero;
    }

    public static void calcularVolumenCono() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio de la base del cono:");
        double radio = input.nextDouble();
        System.out.println("Ingrese la altura del cono:");
        double altura = input.nextDouble();
        if (radio > 0 && altura > 0) {
            double volumen = (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
            System.out.println("El volumen del cono es: " + volumen);
        } else {
            System.out.println("Las dimensiones deben ser numeros positivos");
        }

         return numero;
    }

    public static void calcularVolumenEsfera() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera:");
        double radio = input.nextDouble();
        if (radio > 0) {
            double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
            System.out.println("El volumen de la esfera es: " + volumen);
        } else {
            System.out.println("El radio debe ser un numero positivo");
        }

         return numero;
    }


    public static void calcularAreaZonaEsferica() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera:");
        double radio = input.nextDouble();
        System.out.println("Ingrese el angulo de la zona esferica:");
        double angulo = input.nextDouble();
        if (radio > 0 && angulo > 0 && angulo < 360) {
            double area = 2 * Math.PI * radio * radio * (angulo / 360);
            System.out.println("El area de la zona esferica es: " + area);
        } else {
            System.out.println("Las dimensiones deben ser numeros positivos y el angulo debe estar entre 0 y 360 grados");
        }

         return numero;
    }

    public static void calcularVolumenCasqueteEsferico() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio del casquete esferico:");
        double radio = input.nextDouble();
        System.out.println("Ingrese la altura del casquete esferico:");
        double altura = input.nextDouble();
        if (radio > 0 && altura > 0) {
            double volumen = (Math.PI / 6) * altura * (3 * radio * radio + altura * altura);
            System.out.println("El volumen del casquete esferico es: " + volumen);
        } else {
            System.out.println("Las dimensiones deben ser numeros positivos");
        }

         return numero;
    }

    public static void calcularVolumenCunaEsferica() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio de la cuna esferica:");
        double radio = input.nextDouble();
        System.out.println("Ingrese la altura de la cuna esferica:");
        double altura = input.nextDouble();
        if (radio > 0 && altura > 0) {
            double volumen = (Math.PI / 6) * altura * (3 * radio * radio - altura * altura);
            System.out.println("El volumen de la cuna esferica es: " + volumen);
        } else {
            System.out.println("Las dimensiones deben ser numeros positivos");
        }

         return numero;
    }

    public static void calcularVolumenOrtoedro() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la longitud del ortoedro:");
        double longitud = input.nextDouble();
        System.out.println("Ingrese la anchura del ortoedro:");
        double anchura = input.nextDouble();
        System.out.println("Ingrese la altura del ortoedro:");
        double altura = input.nextDouble();
        if (longitud > 0 && anchura > 0 && altura > 0) {
            double volumen = longitud * anchura * altura;
            System.out.println("El volumen del ortoedro es: " + volumen);
        } else {
            System.out.println("Las dimensiones deben ser numeros positivos");
        }

         return numero;
    }

    public static void calcularVolumenTetraedro() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la longitud de un lado del tetraedro:");
        double lado = input.nextDouble();
        if (lado > 0) {
            double volumen = (Math.sqrt(2) / 12) * lado * lado * lado;
            System.out.println("El volumen del tetraedro es: " + volumen);
        } else {
            System.out.println("La longitud del lado debe ser un numero positivo");
        }

         return numero;
    }

    public static void calcularVolumenHexaedro() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la longitud de un lado del hexaedro:");
        double lado = input.nextDouble();
        if (lado > 0) {
            double volumen = lado * lado * lado;
            System.out.println("El volumen del hexaedro es: " + volumen);
        } else {
            System.out.println("La longitud del lado debe ser un numero positivo");
        }

         return numero;
    }

    public static void calcularVolumenOctaedro() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la longitud de un lado del octaedro:");
        double lado = input.nextDouble();
        if (lado > 0) {
            double volumen = (Math.sqrt(2) / 3) * lado * lado * lado;
            System.out.println("El volumen del octaedro es: " + volumen);
        } else {
            System.out.println("La longitud del lado debe ser un numero positivo");
        }

         return numero;
    }


    public static void calcularVolumenDodecaedro() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la longitud de un lado del dodecaedro:");
        double lado = input.nextDouble();
        if (lado > 0) {
            double volumen = ((15 + 7 * Math.sqrt(5)) / 4) * lado * lado * lado;
            System.out.println("El volumen del dodecaedro es: " + volumen);
        } else {
            System.out.println("La longitud del lado debe ser un numero positivo");
        }
         return numero;
    }

    public static void calcularVolumenIcosaedro() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la longitud de un lado del icosaedro:");
        double lado = input.nextDouble();
        if (lado > 0) {
            double volumen = (5 / 12) * (3 + Math.sqrt(5)) * lado * lado * lado;
            System.out.println("El volumen del icosaedro es: " + volumen);
        } else {
            System.out.println("La longitud del lado debe ser un numero positivo");
        }

         return numero;
    }

    public static void calcularVolumenTroncoCono() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio mayor del tronco de cono:");
        double radioMayor = input.nextDouble();
        System.out.println("Ingrese el radio menor del tronco de cono:");
        double radioMenor = input.nextDouble();
        System.out.println("Ingrese la altura del tronco de cono:");
        double altura = input.nextDouble();
        if (radioMayor > 0 && radioMenor > 0 && altura > 0) {
            double volumen = (Math.PI / 3) * altura * (Math.pow(radioMayor, 2) + radioMayor * radioMenor + Math.pow(radioMenor, 2));
            System.out.println("El volumen del tronco de cono es: " + volumen);
        } else {
            System.out.println("Las dimensiones deben ser numeros positivos");
        }

         return numero;
    }

    public static void calcularVolumenTroncoPiramide() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el area de la base mayor del tronco de piramide:");
        double areaBaseMayor = input.nextDouble();
        System.out.println("Ingrese el area de la base menor del tronco de piramide:");
        double areaBaseMenor = input.nextDouble();
        System.out.println("Ingrese la altura del tronco de piramide:");
        double altura = input.nextDouble();
        if (areaBaseMayor > 0 && areaBaseMenor > 0 && altura > 0) {
            double volumen = (altura / 3) * (areaBaseMayor + areaBaseMenor + Math.sqrt(areaBaseMayor * areaBaseMenor));
            System.out.println("El volumen del tronco de piramide es: " + volumen);
        } else {
            System.out.println("Las dimensiones deben ser numeros positivos");
        }

         return numero;
    }


    public static void calcularAreaPrima() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la arista de la prima:");
        double arista = input.nextDouble();
        if (arista > 0) {
            double area = 5 * Math.sqrt(3) * Math.pow(arista, 2);
            System.out.println("El area de la prima es: " + area);
        } else {
            System.out.println("La longitud de la arista debe ser un numero positivo");
        }

        return numero;
    }




       try {
         return lector.nextInt();
        } catch (InputMismatchException e) {
            return  ;
    
        }
    }


}















