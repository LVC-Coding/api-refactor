package lvc.coding.apirefactor.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class MultiApiRequest {
    @ApiModelProperty(example = "호출 대상 api url list")
    List<String> urlList;
    @ApiModelProperty(example = "호출 대상 api에 대한 header list")
    List<String> headerList;
    @ApiModelProperty(example = "호출 대상 api에 대한 queryParam list")
    List<Map<String, String>> queryParamList;
    @ApiModelProperty(example = "어떻게 반환하고 싶은지 정의한 responseType list")
    ResponseType responseType;
}
