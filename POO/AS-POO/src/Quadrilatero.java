public class Quadrilatero {

double calcularArea(double altura, double largura){
    return altura * largura;
}
double calcularArea(double lado) {
    return lado * lado;
}
double calcularArea(double baseMenor, double baseMaior, double altura){
    return((baseMaior * baseMenor)*altura / 2);
}
}
