import java.util.Arrays;

public class Block5 {
    // 5.1 Поиск первого значения
    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал индекс первого вхождения числа x в массив arr.
    Если число не входит в массив – возвращается -1.
    */
    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }


    // 5.2 Поиск последнего значения
    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал индекс последнего вхождения числа x в массив arr.
    Если число не входит в массив – возвращается -1.
    */

    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // 5.3 Поиск максимального
    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал наибольшее по модулю
    (то есть без учета знака) значение массива arr.
     */
    public static int maxAbs(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int maxValue = arr[0];
        int maxAbsValue = Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > maxAbsValue) {
                maxValue = arr[i];
                maxAbsValue = Math.abs(arr[i]);
            }
        }
        return maxValue;
    }

    // 5.4 Подсчет позитива
    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал количество положительных элементов массива arr.
     */
    public static int countPositive(int[] arr) {
        int countValue = 0;
        for (int elem : arr) {
            if (elem > 0) {
                countValue++;
            }
        }
        return countValue;
    }


    // 5.5 Палиндром
    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал true, если массив arr является палиндромом,
    то есть справа-налево и наоборот читается одинаково
     */
    public static boolean palindrom(int[] arr) {
        if (arr.length == 1) {
            return true;
        }
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    // 5.6 Реверс
    /*
    Необходимо реализовать метод таким образом, чтобы он изменял массив arr.
    После проведенных изменений массив должен быть записан задом-наперед
     */
    public static void reverse(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 5.7 Возвратный реверс
    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
    в котором значения массива arr записаны задом наперед.
     */
    public static int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[arr.length - 1 - i] = arr[i];
        }
        return result;
    }

    // 5.8 Объединение
    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
    в котором сначала идут элементы первого массива (arr1), а затем второго (arr2).
     */
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[i + arr1.length] = arr2[i];
        }
        return result;
    }

    // 5.9 Все вхождения
    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
    в котором записаны индексы всех вхождений числа x в массив arr.
     */
    public static int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }

    //5.10 Удалить негатив
    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
    в котором записаны все элементы массива arr кроме отрицательных.
     */
    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }

    //5.11 Добавление в массив
    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, который будет содержать
    все элементы массива arr, однако в позицию pos будет вставлено значение x.
     */
    public static int[] add(int[] arr, int x, int pos) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        result[pos] = x;
        for (int i = pos + 1; i < arr.length + 1; i++) {
            result[i] = arr[i - 1];
        }
        return result;
    }

    // 5.12 Добавление массива в массив
    /*
    Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
    который будет содержать все элементы массива arr, однако в позицию pos будут вставлены значения массива ins.
     */
    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = pos; i < pos + ins.length; i++) {
            result[i] = ins[i - pos];
        }
        for (int i = pos + ins.length; i < arr.length + ins.length; i++) {
            result[i] = arr[i - ins.length];
        }
        return result;
    }

}
