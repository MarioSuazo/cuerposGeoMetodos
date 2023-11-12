import java.util.Scanner;

public class cuerposGMet {
    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        try {
            principal();
        } catch (Exception e) {
            System.out.println("Error.");
        }
    }

    public static void principal(){
        byte op;
        do{
            menu();
            op = lector.nextByte();
            switch(op){
                case 1:
                    prisma();
                break;
                
                case 2:
                    cilindro();                    
                break;

                case 3:
                    piramide();
                break;

                case 4:
                    cono();
                break;

                case 5:
                    esfera();
                break;

                case 6:
                    zonaEsferica();
                break;

                case 7:
                    casqueteEsferico();
                break;

                case 8:
                    troncoCono();
                break;

                case 9:
                    troncoPiramide();
                break;

                case 10:
                    husoYCuñaEsf();
                break;

                case 11:
                    tetraedro();                    
                break;

                case 12:
                    hexaedro();                    
                break;

                case 13:
                    octaedro();
                break;

                case 14:
                    dodecaedro();
                break;

                case 15:
                    icosaedro();
                break;

                case 16:
                    ortoedro();
                break;

                case 17:
                    finalizar();
                break;
            }
        }while (op != 17);
    }

    public static void prisma(){
        System.out.println("\n\tPrisma.");
        System.out.println("Ingresar la cantidad de lados: ");
        int cantidadLados = lector.nextInt();
            
        System.out.println("Ingresar la longitud de un lado: ");
        double longitudLados = lector.nextDouble();
            
        System.out.println("Ingresar la altura: ");
        double altura = lector.nextDouble();
            
        double Pbase = cantidadLados * longitudLados;
        double areaL = Pbase * altura;
        Double alfa = (Math.PI/180) * (380/cantidadLados);
        double apotema =  longitudLados / (2 * Math.tan((alfa)/2));
        double Abase = (Pbase * apotema)/2;
        double areaT = areaL + 2 * Abase;  
        double volumen = Abase * altura; 
                    
        System.out.println("El Area lateral es: " + areaL );
        System.out.println("El Area Total es: " + areaT );
        System.out.println("El Volumen es: " + volumen );
    }

    public static void cilindro(){
        System.out.println("\n\tCilindro.");
        System.out.println("Digitar el radio: ");
        double radio = lector.nextDouble();
            
        System.out.println("Digitar la altura: ");
        double altura = lector.nextDouble();
            
        double Pbase = (2* Math.PI) * radio;
        double areaL = Pbase * altura;
        double Abase = Math.PI * Math.pow(radio, 2);
        double areaT = areaL + (2 * Abase);
        double volumen = Abase * altura;
             
        System.out.println("El Area lateral es: " + areaL );
        System.out.println("El Area Total es: " + areaT );
        System.out.println("El Volumen es: " + volumen );
    }

    public static void piramide(){
        System.out.println("\n\tPiramide.");
        System.out.println("Ingresar la altura: ");
        double altura = lector.nextDouble();
            
        System.out.println("Ingresar la longitud de los lados: ");
        double longitudLados = lector.nextDouble();
            
        System.out.println("Ingresar el ancho de los lados: ");
        double anchoL = lector.nextDouble();
            
        double Pbase = 2 * longitudLados + 2 * anchoL;
        double apotema = longitudLados/2;
        double APiramide = Math.sqrt(Math.pow(altura, 2) + Math.pow(apotema, 2));
        double areaL = (Pbase * APiramide)/2;
        double areaT = areaL + Pbase;
        double Abase = longitudLados/2;
        double volumen = (Abase* altura)/3;
            
        System.out.println("El Area lateral es: " + areaL );
        System.out.println("El Area total es: " + areaT );
        System.out.println("El Volumen es: " + volumen );
    }

    public static void cono(){
        System.out.println("\n\tCono.");
        System.out.println("Digitar la altura: ");
        double altura = lector.nextDouble();
            
        System.out.println("Digitar el radio: ");
        double radio = lector.nextDouble();
            
        double generatriz = Math.sqrt(Math.pow(altura, 2) + Math.pow(radio, 2));
        double areaL = Math.PI * radio * generatriz;
        double Abase = Math.PI * (radio * radio);
        double areaT = areaL + Abase;
        double volumen = (Abase + areaL) /3;
            
        System.out.println("El Area lateral es: " + areaL );
        System.out.println("El Area total es: " + areaT );
        System.out.println("El Volumen es: " + volumen );
    }

    public static void esfera(){
        System.out.println("\n\tEsfera.");
        System.out.println("Ingresar el radio: ");
        double radio = lector.nextDouble();
            
        double area = 4 * Math.PI * Math.pow(radio, 2);
        double volumen = (4/3) * Math.PI * Math.pow(radio, 3);
            
        System.out.println("El Area es: " + area);
        System.out.println("El Volumen es: " + volumen);
    }

    public static void zonaEsferica(){
        System.out.println("\n\tZona Esferica.");
        System.out.println("Digitar el radio: ");
        double radio = lector.nextDouble();
            
        System.out.println("Digitar la altura ");
        double altura = lector.nextDouble();
            
        System.out.println("Digitar el radio mayor: ");
        double radioMayor = lector.nextDouble();
            
        double area = 2 * Math.PI *  radioMayor * altura;
        double volumen = (Math.PI * altura * (Math.pow(altura, 2) + 3 * Math.pow(radio, 2) + 3 * Math.pow(radioMayor, 2)))/6;
        
        System.out.println("El Area es: " + area);
        System.out.println("El Volumen es: " + volumen);
    }

    public static void casqueteEsferico(){
        System.out.println("\n\tCasquete Esferico.");
        System.out.println("Ingresar la altura ");
        double altura = lector.nextDouble();
            
        System.out.println("Ingresar el radio mayor: ");
        double radioMayor = lector.nextDouble();
            
        double area = 2 * Math.PI *  radioMayor * altura;
        double volumen = (Math.PI * Math.pow(altura, 2) * (3*radioMayor - altura))/6;
        
        System.out.println("El Area es: " + area);
        System.out.println("El Volumen es: " + volumen);
    }

    public static void troncoCono(){
        System.out.println("\n\tTronco de Cono.");
        System.out.println("Digitar la altura: ");
        double altura = lector.nextDouble();
            
        System.out.println("Digitar el radio menor: ");
        double radioMenor = lector.nextDouble();
            
        System.out.println("Digitar el Radio mayor: ");
        double radioMayor = lector.nextDouble();
        
        double x = radioMayor - radioMenor;
        double xr = radioMayor + radioMenor;
        double xR = radioMayor * radioMenor;
        double x2 = x * x;
        double y2 = altura * altura;
        double rM2 = radioMayor * radioMayor;
        double rm2 = radioMenor * radioMenor;
        double f = rM2 + rm2 + xR;
        
        double generatriz = Math.sqrt(y2 + x2);
        double ABase = Math.PI * rM2;
        double Abase = Math.PI * rm2;

        double areaL = Math.PI * generatriz * xr;
        double areaT = areaL + ABase + Abase;

        double volumen = (Math.PI * altura * f) / 3;
            
        System.out.println("El Area lateral es: " + areaL );
        System.out.println("El Area total es: " + areaT );
        System.out.println("El Volumen es: " + volumen );
    }

    public static void troncoPiramide(){
        System.out.println("\n\tTronco de Piramide.");
        System.out.println("Ingresar la longitd del lado mayor: ");
        double longMayor = lector.nextDouble();
            
        System.out.println("Ingresar la longitud del lado menor: ");
        double longMenor = lector.nextDouble();
            
        System.out.println("Ingresar la altura: ");
        double altura = lector.nextDouble();
            
        double longMayor_Mitad = longMayor / 2;
        double LMM2 = longMayor_Mitad * longMayor_Mitad;
        double alt2 = altura * altura;
        double Apir = (Math.sqrt(LMM2 + alt2));

        double ABase = longMayor * longMayor;
        double Abase = longMenor * longMenor;
        double PBase = longMayor * 4;
        double Pbase = longMenor * 4;

        double areaL = ((PBase + Pbase)/2) * Apir;
        double A2Base = ABase + ABase;
        double A2base = ABase + Abase;
        double areaT = areaL + A2Base;
        double Abase2 = ABase * Abase;

        double volumen = (altura * (A2base + Math.sqrt(Abase2))) / 3;
            
        System.out.println("El Area lateral es: " + areaL );
        System.out.println("El Area total es: " + areaT );
        System.out.println("El Volumen es: " + volumen );
    }

    public static void husoYCuñaEsf(){
        System.out.println("\n\tHuso y Cuña Esferico.");
        System.out.println("Digitar el radio: ");
        double radio = lector.nextDouble();
            
        System.out.println("Digitar el numero de grados: ");
        double noGrados = lector.nextDouble();
            
        double area = (4 * Math.PI * Math.pow(radio, 2) * noGrados)/360;
        double volumen = (4/3) * ((Math.PI * Math.pow(radio, 3) * noGrados)/360);
            
        System.out.println("El Area es: " + area);
        System.out.println("El Volumen es: " + volumen);
    }

    public static void tetraedro(){
        System.out.println("\n\tTetraedro.");
        System.out.println("Ingresar un arista: ");
        double arista = lector.nextDouble();
        
        double ar = arista * arista * arista;
        double area = ar * Math.sqrt(3) ;
        double volumen = (Math.sqrt(2)/12) * arista;
        double altura = arista * (Math.sqrt(6)/3);
            
        System.out.println("El Area es: " + area);
        System.out.println("El Volumen es: " + volumen);
        System.out.println("El Altura es: " + altura);
    }

    public static void hexaedro(){
        System.out.println("\n\tHexaedro.");
        System.out.println("Digitar un arista: ");
        double arista = lector.nextDouble();
            
        double area = 6 * Math.pow(arista, 2);
        double diagonal = arista * Math.sqrt(3);
        double volumen = Math.pow(arista, 3);
            
        System.out.println("El Area es: " + area);
        System.out.println("El Diagonal es: " + diagonal);
        System.out.println("El Volumen es: " + volumen);
    }

    public static void octaedro(){
        System.out.println("\n\tOctaedro.");
        System.out.println("Ingresar un arista: ");
        double arista = lector.nextDouble();
            
        double area = 2 * Math.pow(arista, 2) * Math.sqrt(3);
        double volumen = (Math.sqrt(2)/3) * Math.pow(arista, 3);
            
        System.out.println("El Area es: " + area);
        System.out.println("El Volumen es: " + volumen);
    }

    public static void dodecaedro(){
        System.out.println("\n\tDodecaedro.");
        System.out.println("Digitar un arista: ");
        double arista = lector.nextDouble();
            
        double ar = arista *arista * arista;
        double apotemaPent = arista / (2 * Math.tan(36));
        double areaPent = (5/2) * arista * apotemaPent;
        double area = 3 * Math.pow(arista, 2) * Math.sqrt(25 + 10 + Math.sqrt(5));
        double volumen = (15 + 7 * (Math.sqrt(5)) * ar) / 4;
                    
        System.out.println("El Area del Pentagono es: "+ areaPent);
        System.out.println("El Area es: " + area);
        System.out.println("El Volumen es: " + volumen);
    }

    public static void icosaedro(){
        System.out.println("\n\tIcosaedro.");
        System.out.println("Ingresar un arista: ");
        double arista = lector.nextDouble();
            
        double area = 5 * Math.pow(arista, 2) * Math.sqrt(3);
        double volumen = (5 * (3 + Math.sqrt(5)) * Math.pow(arista, 3)) / 12;
            
        System.out.println("El Area es: " + area);
        System.out.println("El Volumen es: " + volumen);
    }

    public static void ortoedro(){
        System.out.println("\n\tOrtoedro.");
        System.out.println("Digitar la altura");
        double altura =  lector.nextDouble();
            
        System.out.println("Digitar la base: ");
        double base = lector.nextDouble();
            
        System.out.println("Digitar la arista: ");
        double arista = lector.nextDouble();
            
        double area = 2 * (arista * base + arista * altura + base * altura);
        double diagonal = Math.sqrt(Math.pow(arista, 2) + Math.pow(base, 2) + Math.pow(altura, 2));
        double volumen = arista * base * altura;
            
        System.out.println("El Area es: " + area);
        System.out.println("El Diagonal es: " + diagonal);
        System.out.println("El Volumen es: " + volumen);
    }

    public static void finalizar(){
        System.out.println("\nGracias Por Su Tiempo.\n");
    }

    public static void menu(){
        System.out.println("\n\n\n\t* Calculador de Cuerpos Geometricos *");
        System.out.println("1. Prisma  \t\t\t2. Cilindro \t\t3. Pirámide");
        System.out.println("4. Cono \t\t\t5. Esfera \t\t6. Zona Esférica");
        System.out.println("7. Casquete Esférico \t\t8. Tronco de Cono \t9. Tronco de Pirámide");
        System.out.println("10. Huso y Cuña Esférica \t11. Tetraedro \t\t12. Hexaedro");
        System.out.println("13. Octaedro \t\t\t14. Dodecaedro \t\t15. Icosaedro");
        System.out.println("16. Ortoedro \t\t\t\t17. Finalizar");
        System.out.print("\nElija un Cuerpo a Calcular: ");
    }

    /* Ing. Mario Mena. */
}