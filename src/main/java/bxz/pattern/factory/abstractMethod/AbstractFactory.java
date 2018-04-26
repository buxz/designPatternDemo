package bxz.pattern.factory.abstractMethod;


/**
 * 抽象工厂是围绕一个超级工厂创建其他工厂，该超级工厂又称为其他工厂的工厂。
 * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类。
 * 使用场景
 * 	系统的产品多于一个产品族，而系统只消费某一族的产品。
 *优点
 *	当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 */
public interface AbstractFactory {

	public Button createButton();
      
    public Text createText();  
  
}  