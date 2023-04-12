package src.guo.office;

public class BestGold {

    public static void main(String[] args) {

    }

    /**
     * 获取金矿最优效益
     *
     * @param w 工人数量
     * @param p 金矿开采所需的工人数量
     * @param g 金矿储量
     * @return
     */
    public static int getBestGoldMiningV3(int w, int[] p, int[] g) {
        //创建当前结果
        int[] results = new int[w + 1];
        //填充一堆数组
        for (int i = 0; i < g.length; i++) {
            for (int j = w; j >= 1; j--) {
                if (j >= p[i - 1]) {
                    results[j] = Math.max(results[j], results[j - p[i - 1]] + g[i - 1]);
                }
            }
        }
        return results[w];
    }
}
