package java2.브루트포스.promrammers;

import java.util.*;

public class LV1_최소직사각형 {

    /****************************************************************
     # 각 배열의 두 값 중 큰 값을 담은 배열1, 각 배열마다 두 값 중 작은 값을 담은 배열2
     * 배열1에서 가장 큰 값, 배열2에서 가장 큰 값 구해서 곱해 줌
     *****************************************************************/

    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;

        for (int i = 0; i < sizes.length; i++){
            width = Math.max(width, Math.max(sizes[i][0], sizes[i][1]));
            height = Math.max(height, Math.min(sizes[i][0], sizes[i][1]));
        }
        return width * height;
    }
}
