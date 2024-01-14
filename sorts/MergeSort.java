package sorts;

public class MergeSort {

    void merge(int[] arrayOfNumbers, int left, int middle, int right)
    {
        // Находим размеры двух подмассивов, которые нужно объединить
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Копируем данные во временные массивы
        for (int i = 0; i < n1; ++i) {
            L[i] = arrayOfNumbers[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arrayOfNumbers[middle + 1 + j];
        }

        // Объединяем временные массивы
        int i = 0, j = 0;
        // Начальный индекс объединенного массива подмассивов
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arrayOfNumbers[k] = L[i];
                i++;
            }
            else {
                arrayOfNumbers[k] = R[j];
                j++;
            }
            k++;
        }

        // Копируем оставшиеся элементы L[], если они есть
        while (i < n1) {
            arrayOfNumbers[k] = L[i];
            i++;
            k++;
        }

        // Копируем оставшиеся элементы R[], если они есть
        while (j < n2) {
            arrayOfNumbers[k] = R[j];
            j++;
            k++;
        }
    }

    int[] sort(int[] arrayOfNumbers, int left, int right)
    {
        if (left < right) {
            // Находим середину
            int middle = left + (right - left) / 2;
            // Сортируем первую и вторую половины
            sort(arrayOfNumbers, left, middle);
            sort(arrayOfNumbers, middle + 1, right);
            // Объединяем отсортированные половинки
            merge(arrayOfNumbers, left, middle, right);
        }
        return arrayOfNumbers;
    }

}
