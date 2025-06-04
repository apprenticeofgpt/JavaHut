package mypack;
import java.util.*;

class MyStudent { // 학생을 표현하는 클래스
    int id;
    String tel;

    public MyStudent(int id, String tel) {
        this.id = id;
        this.tel = tel;
    }
}
public class HashMapStudentEx {
    public static void main(String[] args) {
        // 학생 이름과 Student 객체를 쌍으로 저장하는 HashMap 컬렉션 생성
        HashMap<String, MyStudent> map = new HashMap<String, MyStudent>();

        // 3명의 학생 저장
        map.put("황기태", new MyStudent(1, "010-1111-1111"));
        map.put("이재문", new MyStudent(2, "010-2222-2222"));
        map.put("김남윤", new MyStudent(3, "010-3333-3333"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("검색할 이름>> ");
            String name = scanner.nextLine(); // 사용자로부터 이름 입력
            if (name.equals("exit"))
                break; // exit 입력 시 종료

            MyStudent student = map.get(name); // 이름에 해당하는 Student 객체 검색
            if (student == null)
                System.out.println(name + " 은(는) 없는 사람입니다.");
            else
                System.out.println("id : " + student.id + ", 전화 : " + student.tel);
        }
        scanner.close();
    }
}
