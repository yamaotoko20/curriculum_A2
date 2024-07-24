package curriculum_A2;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// TODO 自動生成されたメソッド・スタブ
				//1.2.3
				// バイト型
				byte myByte = 0;
				myByte = 10;
				// 短整数型
				short myShort = 0;
				myShort = 100;
				// 整数型
				int myInt = 0;
				myInt = 1000;
				// 長整数型 
				long myLong = 0L;
				myLong = 10000;
				// 単精度浮動小数点数型
				float myFloat = 0.0f;
				myFloat = 9.5f;
				// 倍精度浮動小数点数型
				double myDouble = 0.0;
				myDouble = 10.5;
				// 文字型
				char myChar = '\u0000' ;
				myChar = 'a' ;
				// 文字列型
				String myString = null ;
				myString = "ハロー" ;
				// ブーリアン型
				boolean myBoolean = false;
				myBoolean = true;
				
				//4
		        // コンソール出力
		        System.out.println( myByte + myShort + myInt + myLong); // 11110
		        System.out.println(myByte + myByte); // 20
		        System.out.println(myChar + "" + myString + " " + myBoolean); // a ハロー true
		        System.out.println(myByte + myShort + myInt + myLong + myFloat + myDouble); // 11130
		        System.out.println(myByte * myShort * myInt * myLong); // 10000000000
		        System.out.println(myDouble / myShort); // 0.105
		        System.out.println(myByte - myShort); // -90
				
		      //5
		        String num = "20";
		        int num1 = 23;
				

		        // 文字列と整数を連結して出力する
		        System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));
		        
		      //6
		        String info = "山田太郎 18歳 170.5cm 62.2kg 寿司";
		        
		        String name = "山田太郎";
		        
		        int age = 18;
		      
		        double height = 170.5;
		        
		        double weight = 62.2;
		        
		        String favoriteFood = "寿司";
		        
		        // コンソールに情報をフォーマットして出力
		        System.out.println("「初めまして" + name + "です」");
		        System.out.println("「年齢は" + age + "歳です」");
		        System.out.println("「身長は" + height + "cmです」");
		        System.out.println("「体重は" + weight + "kgです」");
		        System.out.println("「好きな食べ物は" + favoriteFood + "です」");
		        
		        
		        //7
		        // BMIを計算
		           double heightMeter = height / 100; // cmをmに変換
		           double bmi = weight / (heightMeter * heightMeter);
		        // BMIを小数点第一位で四捨五入
		           bmi= Math.round(bmi * 10.0) / 10.0;
		           // BMIをコンソールに出力
		           System.out.println("「BMIは" + bmi + "です」");
		           
		        //8   
		           name = "鈴木一郎";
		           age = 24;
		           height = 168.5;
		           weight = 64.2;
		           favoriteFood = "オムライス";
		           
		        // コンソールに情報をフォーマットして出力
		           System.out.println("「初めまして" + name + "です」");
		           System.out.println("「年齢は" + age + "歳です」");
		           System.out.println("「身長は" + height + "cmです」");
		           System.out.println("「体重は" + weight + "kgです」");
		           System.out.println("「好きな食べ物は" + favoriteFood + "です」");
		           
		        // BMIを計算
		            heightMeter = height / 100; // cmをmに変換
		            bmi = weight / (heightMeter * heightMeter);
		        // BMIを小数点第一位で四捨五入
		           bmi= Math.round(bmi * 10.0) / 10.0;
		           // BMIをコンソールに出力
		           System.out.println("「BMIは" + bmi + "です」");
		           

		        //9
		        // 年齢・身長・体重の数値を和算で自己代入
		           age += age;
		           height += height;
		           weight += weight;
		           
		           
		          
		           heightMeter = height / 100;
		            bmi = weight / (heightMeter * heightMeter);
		            bmi = Math.round(bmi * 100.0) / 100.0;
		           
		           // 結果をコンソールに出力
		           System.out.println("初めまして" + name + "です");
		           System.out.println("年齢は" + age + "歳です");
		           System.out.println("身長" + height + "cmです");
		           System.out.println("体重は" + weight + "kgです");
		           System.out.println("好きな食べ物は" + favoriteFood + "です");
		           System.out.println("BMIは" + bmi + "です");
		           
		         //10  
		            age = 24;
		           boolean isAgeOver25 = age >= 25;
		           System.out.println(isAgeOver25);

		           //11
		           // 年齢・身長・体重を文字列型に型変換して繋げる
		              String ageStr = String.valueOf(age = 24);
		              String heightStr = String.valueOf(height = 168.5);
		              String weightStr = String.valueOf(weight = 64.2);
		              String connect = ageStr + heightStr + weightStr;
		              
		              
		              // 結果をコンソールに出力
		                 System.out.println( connect);
		                 
		                 
		                 
		               //12
		                 
		                 
		               // 年齢・身長を文字列型から整数型に変換して出力
		               int ageInt = Integer.parseInt(String.valueOf(age));
		               int heightInt = (int) Double.parseDouble(String.valueOf(height));

		              // 結果をコンソールに出力
		              System.out.println(ageInt);
		              System.out.println(heightInt);
		              
		              //13
		              
		              // 年齢が25歳以上もしくは身長が160cm以上であればtrueを出力
		                 boolean  AgeHeight = ageInt >= 25 || heightInt >= 160;

		                 // 結果をコンソールに出力
		                 System.out.println(AgeHeight);
		             
		                 
		                 
			}
		}