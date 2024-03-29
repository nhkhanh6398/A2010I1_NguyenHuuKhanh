import { Component, OnInit } from '@angular/core';
import {DictionaryService, IWord} from "../dictionary.service";
import {Subscription} from "rxjs";
import {ActivatedRoute, ParamMap} from "@angular/router";

@Component({
  selector: 'app-dictionary-detail',
  templateUrl: './dictionary-detail.component.html',
  styleUrls: ['./dictionary-detail.component.css']
})
export class DictionaryDetailComponent implements OnInit {


  // @ts-ignore
  word: IWord;
  // @ts-ignore
  sub: Subscription;
  key!: string | null;
  constructor(
    private activatedRoute: ActivatedRoute,
    private dictionaryService: DictionaryService
  ) { }

  ngOnInit() {
    /*
    const {snapshot} = this.activatedRoute;
    const key = snapshot.paramMap.get('key');
    const meaning = this.dictionaryService.search(key);
    this.word = {
      key: key,
      meaning: meaning
    };
    */
    this.sub = this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
       this.key = paramMap.get('key');
      const meaning = this.dictionaryService.search(this.key);

      // @ts-ignore

      this.word = {
        key: this.key,
        meaning: meaning
      };
    });
  }
  ngOnDestroy(): void {
    this.sub.unsubscribe();
  }

}
