package tomAndHarry.collection.set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetHomeworkA {
    public static void main(String[] args) {
        System.out.println("생성 된 로또 번호는");
        System.out.print(generateLottoNumbers());
        System.out.print(" 입니다.");
    }

    static Set<Integer> generateLottoNumbers() {
        Set<Integer> lotto = new TreeSet<>();
        Random random = new Random();

        while (lotto.size() < 6) {
            int num = random.nextInt(45) + 1;
            lotto.add(num);
        }

        return lotto;
    }
}
