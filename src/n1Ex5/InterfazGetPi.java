package n1Ex5;


/*La annotaci� functional interfaz ens permet implementar m�todes dins del codi
i aquests m�todes poden realitzar funcions diferents per cada inst�ncia de la classe*/

@FunctionalInterface
interface InterfazGetPi {
    
    double getPiValue();
    
}