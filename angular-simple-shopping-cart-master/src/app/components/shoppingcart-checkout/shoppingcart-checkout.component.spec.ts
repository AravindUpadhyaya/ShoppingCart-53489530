import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShoppingcartCheckoutComponent } from './shoppingcart-checkout.component';

describe('ShoppingcartCheckoutComponent', () => {
  let component: ShoppingcartCheckoutComponent;
  let fixture: ComponentFixture<ShoppingcartCheckoutComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShoppingcartCheckoutComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShoppingcartCheckoutComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
