package timeDepart;

/**
 * 時刻表データ（文字列・PL⇔BI）を保持するクラス
 * @author cook1293
 */

public class TimeDTO {

	private String[] type = new String[2];	//列車種別
	private String[] train = new String[2];	//路線名
	private String[] dhour = new String[2];	//発車時
	private String[] dmin = new String[2];	//発車分
	private String[] dest = new String[2];	//行先


	//各フィールドのゲッター及びセッター
	public String getType(int i) {
		return type[i];
	}
	public void setType(String type,int i) {
		this.type[i] = type;
	}

	public String getTrain(int i) {
		return train[i];
	}
	public void setTrain(String train,int i) {
		this.train[i] = train;
	}

	public String getDhour(int i) {
		return dhour[i];
	}
	public void setDhour(String dhour,int i) {
		this.dhour[i] = dhour;
	}

	public String getDmin(int i) {
		return dmin[i];
	}
	public void setDmin(String dmin,int i) {
		this.dmin[i] = dmin;
	}

	public String getDest(int i) {
		return dest[i];
	}
	public void setDest(String dest,int i) {
		this.dest[i] = dest;
	}

	//各フィールドの確認用メソッド
	public String toString(int i){
		return type[i] + train[i] + dhour[i] + dmin[i] + dest[i];
	}
}
