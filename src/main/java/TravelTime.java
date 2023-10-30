public class TravelTime {
    public static void main(String[] args) {
        final int distanceFromHomeToOffice = 50;
        System.out.println("Расстояние от дома до офиса - " + distanceFromHomeToOffice + " км");

        final double averageTaxiSpeed = 40;
        System.out.println("Средняя скорость такси - " + averageTaxiSpeed + " км/ч");

        final double timeFromHomeToOffice = distanceFromHomeToOffice / averageTaxiSpeed;
        System.out.println("Время от дома до офиса = " + timeFromHomeToOffice + " часа");

/**        // Время можно перевести в привычный для человека вид - 1 ч 15 мин 0 сек
        int hoursFromHomeToOffice = (int) timeFromHomeToOffice; // целая часть - часы
        double minute = 60 * (timeFromHomeToOffice - hoursFromHomeToOffice); // дробную часть умножаем на 60
        int minuteFromHomeToOffice = (int) minute; // целая чать - минуты
        double second = 60 * (minute - minuteFromHomeToOffice);
        int secondFromHomeToOffice = (int) second;
        System.out.println(hoursFromHomeToOffice + " ч " + minuteFromHomeToOffice + " мин " + secondFromHomeToOffice + " сек");
*/
        final double decelerationFactor = 1.3;
        System.out.println("Коэффициент замедления транспорта вечером - " + decelerationFactor);

        final double timeFromOfficeToHome = timeFromHomeToOffice * decelerationFactor;
        System.out.println("Время от офиса до дома = " + timeFromOfficeToHome + " часа");
    }
}
