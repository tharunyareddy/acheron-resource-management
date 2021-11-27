package org.arm.resource.mngt.vo;
import org.arm.resource.mngt.entity.Resource;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public  interface ResourceMapper {
  static ResourceMapper INSTANCE=Mappers.getMapper(ResourceMapper.class);
	ResourceVO fromResource(Resource resource);
}