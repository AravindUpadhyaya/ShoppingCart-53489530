import { async, ComponentFixture, TestBed } from "@angular/core/testing";

import { ShoppingcartLoginComponent } from "./shoppingcart-login.component";

describe("ShoppingcartLoginComponent", () => {
  let component: ShoppingcartLoginComponent;
  let fixture: ComponentFixture<ShoppingcartLoginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShoppingcartLoginComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShoppingcartLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it("should create", () => {
    expect(component).toBeTruthy();
  });
});
