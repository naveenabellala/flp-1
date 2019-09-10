import { TestBed } from '@angular/core/testing';

import { DispproductserviceService } from './dispproductservice.service';

describe('DispproductserviceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: DispproductserviceService = TestBed.get(DispproductserviceService);
    expect(service).toBeTruthy();
  });
});
