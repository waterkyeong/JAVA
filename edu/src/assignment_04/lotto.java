package assignment_04;
//구현과제로 실습
//hashset을 arraylist로 변환하여 정렬하기 구현

/*
 * 로또 당첨 규칙:
 * 꽝: 번호 2개, 1개
 * 5등: 번호 3개 - 5000원
 * 4등: 번호 4개 - 5만원
 * 3등: 번호 5개 - 150만원 - 판매금액에 변동(판매금액의 12.5%)
 * 2등: 3등번호 + 보너스번호 - 3000만원 - 판매 금액에 변동, 당첨 확률: 1,300,000분의1
 * 1등: 6개 숫자 - 당첨 확률 8,000,000 분의 1, 10억 ~ 30억
 */
//hashset을 arraylist로 변환하여 정렬하기 구현

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
class ListComparator implements Comparator<List<Integer>>{
	@Override
	public int compare(List<Integer> l1, List<Integer> l2) {
		Iterator<Integer> ait = l1.iterator();
		Iterator<Integer> bit = l2.iterator();
		while (ait.hasNext()) {
			int anum = ait.next();int bnum = bit.next();
			if ( anum > bnum) return 1;
			else if (anum < bnum) return -1;
			
		}
		return 0;
	}
}
public class lotto {

	public static void main(String[] args) {

		lotto_generator(10);

	}

	public static void lotto_generator(int n) {
		Random number = new Random();
		HashSet<HashSet<Integer>> lot = new HashSet<>(); // 10000장 복권
		HashSet<Integer> lotto = null; // 복권1장
		List<List<Integer>> al = new ArrayList<>();
		/*
		 * [[35, 40, 27, 29, 14, 31, 15], [0, 1, 18, 38, 6, 24, 29],
		 *  [16, 32, 0, 18, 34, 22, 14], [32, 34, 40, 9, 12, 28, 14],
		 *  [0, 19, 6, 9, 42, 29, 13], [2, 3, 37, 43, 44, 29, 14],
		 *  [33, 1, 17, 22, 6, 8, 12], [34, 21, 9, 10, 27, 44, 45], [18, 34, 23, 9, 28, 29, 15],
		 *  [32, 6, 23, 24, 10, 27, 43]]
		 */
		for (int i = 0; i < n; i++) { //n = 10000, lot변수가 10000개 복권 갖고 있어야한다.
//			lotto.add(number.nextInt());
			lotto = new HashSet<>();
			//구현할 부분=============================================================================================================
			
			lotto = new HashSet<Integer>(); // 복권 1장
			for(int j =0; lotto.size()<6; j++) {
				lotto.add(number.nextInt(46));
			}
			
			lot.add(lotto);
			
		}
		System.out.println("\nlot hashset을 출력\n");
		for (HashSet<Integer> eachLotto : lot) {
			/*
			 * 33  1 17 22  6  8  + 보너스번호: 12
			 *  0  1 18 38  6 24  + 보너스번호: 29
			 */
			//구현할 부분 - ArrayList를 사용 ==================================================================================================
			
				ArrayList<lotto> i = new ArrayList<>();
				
			
			
				Collections.sort();
		}
		System.out.println("복권 정렬전::lot = " + al);
		
		al.sort(new ListComparator());
		System.out.println("복권 정렬후::lot = " + al);
		//hashset의 리스트를 정렬하는 알고리즘 개발
		//hashset를 arrayList로 변환
		//당첨번호 추첨
		HashSet<Integer> win = new HashSet<>();
		for (int j = 0; win.size() < 7; j++) {//6개 번호와 보너스 번호
			win.add(number.nextInt(46));
		}
		System.out.print("당첨번호: " + win);//6개의 당첨번호와 보너스번호
		// 6개를 맞힌 복권을 찾는다 
		System.out.println();
		winnerLotto(win, al);//1등을 찾는다
		
	}
	static void winnerLotto(HashSet<Integer> w,List<List<Integer>> al ) {
		// 당첨번호 w에 대하여 발행된 복권 리스트 al의 모든 원소 elem에 대하여 조사한다
		for (int i = 0; i < al.size(); i++) {
		//구현할 부분 ==========================================================================================================================
		}
	}
	static void checkWinner(HashSet<Integer> w,List<Integer> elem) {
		// 당첨번호 w의 각 숫자를 꺼내 복권 엔트리에 포함되어 있는지를 조사
		List<Integer> L = new ArrayList<>(w);
		int count = 0;
		for (int i = 0; i < L.size()-1; i++)
		{
			/*
			 * 당첨번호 각 번호를 몇개 포함하는지를 elem에 대하여 조사
			 */
			//구현할 부분 ========================================================================================================================
		}
		switch (count) {
		case 0:
		case 1:
		case 2:
			System.out.println("꽝");
			break;
		case 3:
			System.out.println("5등 복권 " + elem + " 당첨번호:" + w);
			break;
		case 4:
			System.out.println("4등 복권 " + elem + " 당첨번호:" + w);
			break;
		case 5:
			if (L.get(6).equals(elem.get(6))) { //보너스 번호가 일치하는 지를 조사 
				System.out.println("2등 복권 " + elem + " 당첨번호:" + w);
				break;
			}
			else {
				System.out.println("3등 복권 " + elem + " 당첨번호:" + w);
				break;
			}
			
		case 6:
			System.out.println("1등 복권 " + elem + " 당첨번호:" + w);
			break;
		}


	}
}