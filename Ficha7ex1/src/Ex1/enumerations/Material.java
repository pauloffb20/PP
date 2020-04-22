
package Ex1.enumerations;

public enum Material {


        Aluminio, Carbono;

        public String getmaterial() {
            switch (this) {
                case Aluminio:
                    return "Aluminio";
                case Carbono:
                    return "Carbono";

                default:
                    return "";
            }
        }
    }
