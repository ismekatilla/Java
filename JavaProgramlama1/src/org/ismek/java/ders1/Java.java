package org.ismek.java.ders1;

public class Java {

	public static void main(String[] args) {
		System.out.println("Merhaba Dünya");
	}
}
/*
	https://www.java.com/tr/download/faq/whatis_java.xml
	https://www.java.com/tr/about/
	
	Java ilk olarak Sun Microsystems tarafından 1995 yılında piyasaya sürülen bir programlama dili ve 
	bilgi işlem platformudur. Geliştiricisi James Gosling dir. Java hızlı, güvenli ve güvenilirdir. 
	Dizüstü bilgisayarlardan veri depolama merkezlerine, oyun konsollarından bilimsel süper bilgisayarlara, 
	cep telefonlarından Internet'e kadar Java her yerde!
	
	Bu platformun içerisindeki kavramlardan bahsetmek istersek;
	
	Java Dili (Java Language)
	Java Bytecode
	Java Sanal Makinesi(Java Virtual Machine JVM) 
	Java API leri (Java Application Programming Interfaces)
	Java Çalışma Zamanı Ortamı (Java Runtime Environment JRE)
	Java Geliştirici Kiti (Java Development Kit JDK)
	Java Kod Kuralları (Java Code Conventions)
	Java Standart Sürümü (Java Standard Edition JSE)
	Java Enterprise Sürümü (Java Enterprise Edition JEE)
	Java Uygulama Sunucuları (Java Application Servers)
	Java Mikro Sürümü (Java Micro Edition JME)
	Java Uygulamacıkları (Java Applets)
	JavaFX
	Java Geliştirici Topluluğu
	
	Bilindiği üzere Java uygulamaları platform bağımsızdır ve tüm platformlarda çalışabilir. 
	Sloganı da "Write once, run anywhere" "Bir kere yaz, her yerde çalıştır".
	Bu işlemi Java Virtual Machine (JVM) ile sağlar. Geliştirilen java uygulamaları derleme işleminde 
	java bytecode a dönüştürülür. Bu dönüştürme işleminin amacı uygulamayı java sanal makinesinde çalıştırmaktır. 
	Adından da anlaşılacağı üzere java sanal makinesi bulunduğu işletim sistemi üzerinde bulunan sanal bir makinedir. 
	Peki bu sanal makine nasıl oluşur? Bu sanal makine java runtime environment (JRE) ile birlikte gelir.
	Bilgisayarımıza JRE kurulumu yapmadan bir java uygulaması çalıştıramayız. Çünkü derlenerek java bytecode a
	dönüştürülen java uygulamalarımız sadece JVM üzerinde çalışır ve JVM de JRE içerisindedir.
	
	Bir geliştirici olarak düşündüğümüzde bilgisayarımızda sadece JRE yüklü olması yetmeyecektir. Java uygulamasını
	derlemek için bazı kütüphanelere ihtiyacımız vardır ki bunlar da Java Development Kit (JDK) içerisindedir.
	Buradan hareketle JDK içerisinde JRE yi barındırır. JRE de JVM i barındırır diyebiliriz.
	Bakınız: jdk_jre_jvm.png
	
	Java API leri Java programlarının lokal dosya sistemine, ağ bilgilerini ve daha bir çok şeye erişmesini sağlar.
	Daha hızlı program geliştirmek için kolaylıklar sağlar. Standart Java API leri JRE ile beraber gelir.
	
	Java Code Conventions: Geliştirmeler yaparken bazı kabul görmüş kurallara uymak gerekir. 
	Bir java class ı, değişkenleri vs. isimlendirilirken bazı kurallara uyulması gerekir. Örneğin bir class adı
	rakam ile başlayamaz gibi.
	
	JSE = Masaüstü uygulamaları için
	JEE = Java Sunucuları için (Web Uygulamaları diyebiliriz)
	JME = Mobil uygulamalar için (PDA gibi)
	
	Java Application Servers = Java uygulama sunucuları, Java Web uygulamalarının çalışması için 
	JEE standartlarına bağlı kalınarak hazırlanmış platformlardır. Tomcat, Glassfish, Jetty gibi. 
	
	Java Applets = Web tarayıcı üzerinden indirilen ve çalıştırılan java uygulamlarıdır. Son tarayıcı sürümlerinde
	tarayıcılar java applets desteğini güvenlik açığı olabileceği için çekmeye başlamışlardır.
	
	JavaFX = Silverlight veya Flash benzeri geliştirmeler için

*/