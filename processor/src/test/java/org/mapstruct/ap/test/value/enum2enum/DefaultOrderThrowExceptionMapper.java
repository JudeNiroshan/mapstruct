package org.mapstruct.ap.test.value.enum2enum;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.Named;
import org.mapstruct.ValueMapping;
import org.mapstruct.ap.test.value.ExternalOrderType;
import org.mapstruct.ap.test.value.OrderType;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DefaultOrderThrowExceptionMapper {
    DefaultOrderThrowExceptionMapper INSTANCE = Mappers.getMapper( DefaultOrderThrowExceptionMapper.class );

    @Named("orderTypeToExternalOrderTypeWithException")
    @ValueMapping(source = MappingConstants.ANY_UNMAPPED, target = MappingConstants.THROW_EXCEPTION)
    ExternalOrderType orderTypeToExternalOrderTypeWithException(OrderType orderType);
}
