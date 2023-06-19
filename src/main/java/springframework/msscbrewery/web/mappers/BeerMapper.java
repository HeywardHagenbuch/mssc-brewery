package springframework.msscbrewery.web.mappers;

import org.mapstruct.Mapper;
import springframework.msscbrewery.domain.Beer;
import springframework.msscbrewery.web.model.BeerDto;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
