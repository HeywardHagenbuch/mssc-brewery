package springframework.msscbrewery.services;

import org.springframework.stereotype.Service;
import springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Blue Moon")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return beerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }
}
