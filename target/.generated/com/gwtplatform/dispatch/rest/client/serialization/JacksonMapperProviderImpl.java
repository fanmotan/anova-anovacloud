package com.gwtplatform.dispatch.rest.client.serialization;

import javax.inject.Inject;
import javax.inject.Provider;

import com.google.inject.TypeLiteral;
import com.gwtplatform.dispatch.rest.client.serialization.mappers.*;

public class JacksonMapperProviderImpl extends AbstractJacksonMapperProvider {
    @Inject
    JacksonMapperProviderImpl(Provider<java_lang_IntegerMapper> java_lang_IntegerMapperProvider, 
Provider<com_anova_anovacloud_shared_dto_MatterDtoMapper> com_anova_anovacloud_shared_dto_MatterDtoMapperProvider, 
Provider<com_anova_anovacloud_shared_dispatch_LogInRequestMapper> com_anova_anovacloud_shared_dispatch_LogInRequestMapperProvider, 
Provider<com_anova_anovacloud_shared_dispatch_LogInResultMapper> com_anova_anovacloud_shared_dispatch_LogInResultMapperProvider, 
Provider<java_util_List_com_anova_anovacloud_shared_dto_MatterActionDto_Mapper> java_util_List_com_anova_anovacloud_shared_dto_MatterActionDto_MapperProvider, 
Provider<com_anova_anovacloud_shared_dto_MatterActionDtoMapper> com_anova_anovacloud_shared_dto_MatterActionDtoMapperProvider, 
Provider<java_util_List_com_anova_anovacloud_shared_dto_MatterDto_Mapper> java_util_List_com_anova_anovacloud_shared_dto_MatterDto_MapperProvider, 
Provider<com_anova_anovacloud_shared_dto_CustomerDtoMapper> com_anova_anovacloud_shared_dto_CustomerDtoMapperProvider, 
Provider<java_util_List_com_anova_anovacloud_shared_dto_UserDto_Mapper> java_util_List_com_anova_anovacloud_shared_dto_UserDto_MapperProvider, 
Provider<java_util_List_com_anova_anovacloud_shared_dto_ActionDueDto_Mapper> java_util_List_com_anova_anovacloud_shared_dto_ActionDueDto_MapperProvider, 
Provider<com_anova_anovacloud_shared_dto_UserDtoMapper> com_anova_anovacloud_shared_dto_UserDtoMapperProvider, 
Provider<java_util_List_com_anova_anovacloud_shared_dto_CustomerDto_Mapper> java_util_List_com_anova_anovacloud_shared_dto_CustomerDto_MapperProvider, 
Provider<com_anova_anovacloud_shared_dto_CurrentUserDtoMapper> com_anova_anovacloud_shared_dto_CurrentUserDtoMapperProvider
) {
        addProvider("java.lang.Integer", java_lang_IntegerMapperProvider);
        addProvider("com.anova.anovacloud.shared.dto.MatterDto", com_anova_anovacloud_shared_dto_MatterDtoMapperProvider);
        addProvider("com.anova.anovacloud.shared.dispatch.LogInRequest", com_anova_anovacloud_shared_dispatch_LogInRequestMapperProvider);
        addProvider("com.anova.anovacloud.shared.dispatch.LogInResult", com_anova_anovacloud_shared_dispatch_LogInResultMapperProvider);
        addProvider("java.util.List<com.anova.anovacloud.shared.dto.MatterActionDto>", java_util_List_com_anova_anovacloud_shared_dto_MatterActionDto_MapperProvider);
        addProvider("com.anova.anovacloud.shared.dto.MatterActionDto", com_anova_anovacloud_shared_dto_MatterActionDtoMapperProvider);
        addProvider("java.util.List<com.anova.anovacloud.shared.dto.MatterDto>", java_util_List_com_anova_anovacloud_shared_dto_MatterDto_MapperProvider);
        addProvider("com.anova.anovacloud.shared.dto.CustomerDto", com_anova_anovacloud_shared_dto_CustomerDtoMapperProvider);
        addProvider("java.util.List<com.anova.anovacloud.shared.dto.UserDto>", java_util_List_com_anova_anovacloud_shared_dto_UserDto_MapperProvider);
        addProvider("java.util.List<com.anova.anovacloud.shared.dto.ActionDueDto>", java_util_List_com_anova_anovacloud_shared_dto_ActionDueDto_MapperProvider);
        addProvider("com.anova.anovacloud.shared.dto.UserDto", com_anova_anovacloud_shared_dto_UserDtoMapperProvider);
        addProvider("java.util.List<com.anova.anovacloud.shared.dto.CustomerDto>", java_util_List_com_anova_anovacloud_shared_dto_CustomerDto_MapperProvider);
        addProvider("com.anova.anovacloud.shared.dto.CurrentUserDto", com_anova_anovacloud_shared_dto_CurrentUserDtoMapperProvider);
    }
}
