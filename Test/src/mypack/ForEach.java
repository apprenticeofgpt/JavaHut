package mypack;

public class ForEach {
    enum Week { 월, 화, 수, 목, 금, 토 }

    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5};
        String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};  // "포도"로 수정
        int sum = 0;

        for (int k : n) {
            System.out.print(k + " ");  // 줄바꿈 없이 출력
            sum += k;
        }
        System.out.println("\n합은: " + sum);

        for (String s : names) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (Week day : Week.values()) {
            System.out.print(day + "요일 ");
        }
        System.out.println();
    }
}
