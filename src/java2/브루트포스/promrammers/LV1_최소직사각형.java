package java2.브루트포스.promrammers;

import java.util.*;

public class LV1_최소직사각형 {
    public int[] solution(int[] answers) {
        //수포자 3명의 찍기 패턴
        int[] supoja1 = {1, 2, 3, 4, 5};
        int[] supoja2 = {2, 1, 2, 3, 2, 4, 2, 5, 2};
        int[] supoja3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        //문제를 맞춘 갯수를 담을 배열
        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++){
            if (answers[i] == supoja1[i%supoja1.length]) score[0]++;
            if (answers[i] == supoja2[i%supoja2.length]) score[1]++;
            if (answers[i] == supoja3[i%supoja3.length]) score[2]++;
        }

        //가장 많이 맞춘 점수
        int maxScore = Math.max(Math.max(score[0], score[1]), score[2]);

        //가장 많이 맞춘 점수를 가진 수포자 (여러 명일수도 있으니까)
        //크기가 가변적일 수 있어 리스트 사용
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (maxScore == score[0]) list.add(1);
        if (maxScore == score[1]) list.add(2);
        if (maxScore == score[2]) list.add(3);

        //반환 값이 배열이라 리스트를 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
