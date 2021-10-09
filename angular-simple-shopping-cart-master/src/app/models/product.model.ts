

export class Product {
  public id: number;
  public code: string;
  public name: string;
  public description: string;
  public price: number;
  public quantity: number;
 // public ingredients: Ingredient[];

  public updateFrom(src: Product): void {
    this.id = src.id;
    this.code = src.code;
    this.name = src.name;
    this.description = src.description;
    this.price = src.price;
    this.quantity = src.quantity;
    /*this.ingredients = src.ingredients.map((i) => {
      let ingredient = new Ingredient();
      ingredient.updateFrom(i);
      return ingredient;
    });*/
  }

} 
export class ShoppingCartDto{
  public orderId: string;
  public userId: number;
  public deliveryOptionCode: string;
  public grossTotal: number;
  public price: any;
  public deliveryTotal: any;
  public itemsTotal: any;
  public deliveryOptionId: any;
  public items: Array<items> = [];
 
 constructor() {}
}
//export class CartItem{
  export class items {
    public productId: number;
      public quantity: number;
      public price: number;
      public code: string;
      public name: string;
      public description: string;
  
    constructor() {}
  }
  export class deliveryOption {
      public id: number;
      public name: string;
      public code: string;
      public description: string;
      public price: string;
      constructor() { }
  }
  export class OrderDto {
      public orderNo: string;
  }

