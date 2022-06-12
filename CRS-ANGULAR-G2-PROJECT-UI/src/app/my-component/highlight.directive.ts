import { Directive, ElementRef, Input } from '@angular/core';

@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {

  el:ElementRef
  @Input() value:String ="";
  constructor(el:ElementRef) {
    this.el = el;
    // el.nativeElement.style.backgroundColor = 'yellow';

   }

   ngOnInit() {
    console.log("directive : ", +this.value);
    this.el.nativeElement.style.backgroundColor =this.value;
  }

}
