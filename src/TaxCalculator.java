// BigDecimal sınıfını içe aktar
import java.math.BigDecimal;

public class TaxCalculator {

    public static void main(String[] args) {
        // Ürünün net fiyatını bir double olarak tanımla
        double netPrice = 9.99;
        // KDV oranını bir double olarak tanımla
        double vatRate = 0.23;
        // Satılan ürün miktarını bir int olarak tanımla
        int quantity = 10000;

        // Ürünün brüt fiyatını double aritmetiği kullanarak hesapla
        double grossPrice = netPrice * (1 + vatRate);
        // Brüt fiyatı yazdır
        System.out.println("Double kullanarak brüt fiyat: " + grossPrice);

        // Toplam geliri double aritmetiği kullanarak hesapla
        double totalRevenue = grossPrice * quantity;
        // Toplam geliri yazdır
        System.out.println("Double kullanarak toplam gelir: " + totalRevenue);

        // Net geliri double aritmetiği kullanarak hesapla
        double netRevenue = totalRevenue / (1 + vatRate);
        // Net geliri yazdır
        System.out.println("Double kullanarak net gelir: " + netRevenue);

        // Ürünün net fiyatını bir BigDecimal olarak tanımla
        BigDecimal netPriceBD = new BigDecimal("9.99");
        // KDV oranını bir BigDecimal olarak tanımla
        BigDecimal vatRateBD = new BigDecimal("0.23");
        // Satılan ürün miktarını bir BigDecimal olarak tanımla
        BigDecimal quantityBD = new BigDecimal("10000");

        // Ürünün brüt fiyatını BigDecimal aritmetiği kullanarak hesapla
        BigDecimal grossPriceBD = netPriceBD.multiply(vatRateBD.add(BigDecimal.ONE));
        // Brüt fiyatı yazdır
        System.out.println("BigDecimal kullanarak brüt fiyat: " + grossPriceBD);

        // Toplam geliri BigDecimal aritmetiği kullanarak hesapla
        BigDecimal totalRevenueBD = grossPriceBD.multiply(quantityBD);
        // Toplam geliri yazdır
        System.out.println("BigDecimal kullanarak toplam gelir: " + totalRevenueBD);

        // Net geliri BigDecimal aritmetiği kullanarak hesapla
        BigDecimal netRevenueBD = totalRevenueBD.divide(vatRateBD.add(BigDecimal.ONE), 2, BigDecimal.ROUND_HALF_UP);
        // Net geliri yazdır
        System.out.println("BigDecimal kullanarak net gelir: " + netRevenueBD);

        // Double ve BigDecimal aritmetiği kullanarak elde edilen sonuçları karşılaştır
        System.out.println("Double ve BigDecimal kullanarak net gelir arasındaki fark: " + netRevenueBD.subtract(new BigDecimal(netRevenue)));

        // Arslan adını kod satırlarına ekle
        System.out.println("Arslan, bu kodu yazdı.");
        System.out.println("Arslan, bu kodu düzenledi.");
    }
}

