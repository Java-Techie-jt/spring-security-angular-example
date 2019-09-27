import { TestBed } from '@angular/core/testing';

import { RestapiService } from './restapi.service';

describe('RestapiService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: RestapiService = TestBed.get(RestapiService);
    expect(service).toBeTruthy();
  });
});
