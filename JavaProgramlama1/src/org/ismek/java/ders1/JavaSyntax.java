/*
	Tüm java kodları .java uzantılı bir dosyanın içerisinde yer almalıdır.
	Bir Java uygulaması birçok .java uzantılı dosyadan oluşabilir.

	Java yazılım dilinin söz dizimi(syntax) ı hakkında genel bir bakış yapacak olursak;
	
	1. Paket tanımı (package)
	2. import ifadeleri (import)
	3. Tip Tanımı (Type Declaration)
	4. Field Tanımı (Field Declaration)
	5. Class Initializers (Süslü parantezler arasında kalan bölümdür. ) {} 
	6. Kurucular (Constructors)
	7. Metodlar (Methods)
	8. Tip Tanımlama Sonu (Type Declaration End)
*/


/*
	1. package
	
	Birbiri ile ilişkili Java Class larını gruplar. 
	Java projeleri büyüdüğü zaman, modülleri anlamlı gruplara ayırmak yönetilmesini kolaylaştırır.

	Java paketleri aynı zamanda dosya sisteminde java dosyalarını klasörlemeyi sağlar.
	Her paket aslında bir klasördür. Başka bir deyişle aynı paketteki tüm java dosyaları aynı klasördedir.

	Java paketleri isimlendirilirken tümü küçük harf olmalıdır. 
	Büyük harf de yapılabilir ama kabul görmüş standart budur.

*/
package org.ismek.java.ders1;

/*
 	2. import
 	
	import ifadeleri bulunduğu java dosyası içerisinde, 
	başka bir paketteki java dosyasını çağırmak için kullanılır.
	
	Yani aynı pakette olmayan farklı java dosyalarını kullanmak istiyorsak, 
	kullanmak istediğimiz java dosyasının paketini import etmemiz gerekir.
*/
import java.util.Scanner;


/*
 	3. Type Declaration
	Java dosyasının tipi belirlenir. class, abstract class, interface, enum, anotasyon
*/
public class JavaSyntax {

/*
	4. Field Declaration
	Java dosyası içerisinde genel olarak tanımlanan değişkenlere alan denir. 
	Tanımı aşağıdaki gibi yapılır.
	[access_modifier] [static] [final] type name [= initial value] ;
*/
	
/*
	5. Class Initializers (Süslü parantezler arasında kalan bölümdür. )
	Bu class ın yeni bir örneği oluşturulduğunda ilk çalışacak bölümdür.
	Class Initializers class ın bir üyesidir.
	
	Değişken tanımı yapılırken final değişkenlerin değeri mutlaka atanmalıdır.
	Bu işlem ya değişken tanımı yapıldığında yapılmalıdır. Ya da initializer da yapılmalıdır.
	Initializer özellikle final değişkenlere çalışma anında değer atamak için kullanılır.
	Consructor da bu işlem gerçekleştirilemez.
*/
	{}
	
/*
	6. Constructors
	Constructors Class class ın bir üyesi değildirler.
	Class Initializer dan farklı olarak parametre alabilirler.
*/
	public JavaSyntax() {
	}
	
/*
	7. Methods
	Class ın bir örneği oluşturulduğunda o class içerisinde çalıştırılabilecek bir çok metod olabilir.
	Metodlar iş yapan bölümlerdir diyebiliriz.
	
	main metodu static bir metoddur. Class ın örneği oluşturulmadan çalıştırılabilir. 
	metodOrnegi ise öncelikle JavaSyntax class ının bir örneği oluşturulmalı. Daha sonra çağrılmalıdır.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	private String metodOrnegi() {
		Scanner scanner = new Scanner(System.in);
		return "Metod Örneği";
	}
	
/*
	8. Type Declaration End
	Bundan sonra tip tanımlaması yapılamaz. Burası kod yazılabilecek son satırdır.
 */
}