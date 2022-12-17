package lvc.coding.apirefactor.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class SingleApiRequest {
    @ApiModelProperty(example = "호출 대상 api url")
    String url;
    @ApiModelProperty(example = "호출 대상 api에 대한 header")
    String header;
    @ApiModelProperty(example = "호출 대상 api에 대한 queryParam")
    Map<String, String> queryParam;
    @ApiModelProperty(example = "어떻게 반환하고 싶은지 정의한 responseType")
    ResponseType responseType;
}
