public class Caja {
    public enum Unidad{
        CM, M
    }

    protected final double ancho, alto, fondo;
    protected final Unidad unidad;
    protected double volumen;
    public String etiqueta;

    Caja (double ancho, double alto, double fondo, Unidad unidad){

        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;

        //cómo se haría con un if?...

        switch (unidad){
            case CM:
                volumen = ((ancho/100) * (alto/100) * ( fondo/100 ));
                break;
            case M:
                volumen = (ancho * alto *  fondo );
                break;
        }
        public double getVolumen(){
            return volumen;
        }

        public void setEtiqueta(String etiqueta){

            this.etiqueta = etiqueta;
        }

        @Override
                public String toString(){
            return ancho + "x" + alto + "x" + fondo + "-" + unidad;
            System.out.println(etiqueta);
        }


    }
}
