import { async, ComponentFixture, TestBed } from "@angular/core/testing";

import { ShoppingcartOrdernoComponent } from "./shoppingcart-orderno.component";

describe("ShoppingcartOrdernoComponent", () => {
  let component: ShoppingcartOrdernoComponent;
  let fixture: ComponentFixture<ShoppingcartOrdernoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShoppingcartOrdernoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShoppingcartOrdernoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it("should create", () => {
    expect(component).toBeTruthy();
  });
});
