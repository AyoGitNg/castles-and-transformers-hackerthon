import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {NewTransformerComponent} from './new-transformer.component';

describe('NewTransformerComponent', () => {
  let component: NewTransformerComponent;
  let fixture: ComponentFixture<NewTransformerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [NewTransformerComponent]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewTransformerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
