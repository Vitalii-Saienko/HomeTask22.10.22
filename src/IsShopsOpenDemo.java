/*
Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
Реализует логический метод canBuy,, возвращающий true ** Значение этой переменной должно быть true,
 если хотя бы один магазин открыт, иначе false. Отобразите строку «Я могу купить еду, это ……» и значение.
 */
class IsShopsOpenDemo {
    public static void main(String[] args) {
    IsShopsOpen isShopsOpen = new IsShopsOpen();
    isShopsOpen.isOpen();
    isShopsOpen.activity(isShopsOpen.canBuy());
    }
}