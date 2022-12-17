# api-refactor
Api refactor는 호출한 api를 원하는 응답값으로 변환해주는 라이브러리입니다.

해당 프로젝트를 통해 api의 개념 및 jackson을 이용한 json 변환에 대해 공부하는 것을 주 목표로 하였습니다.

## 1. api-refactor의 구조
- 두 개의 api로 구성되어 있으며 각 api는 다음의 기능을 수행합니다.
  - 단일: 단일 Api를 호출하여 원하는 응답값으로 변환합니다.
  - 복수: 복수 Api를 호출하여 원하는 응답값으로 변환합니다.

## 2. api-refactor의 사용법
기능은 GET Method 조회로 제한하며, API Spec은 다음과 같습니다.

1. 단일 API 호출

### URL 
| Http method	| URI                   |
|---|-----------------------|
|POST| /api-refactor/apiUrl	 |

### Parameter

| value        | type                  | definition         |                     
|--------------| --------------------- |--------------------| 
| url          | String                | 호출할 api url을 등록합니다 |
| header       | Map<String, String>   | 호출할 api에 필요한 헤더를 등록합니다. |
| queryParam   | Map<String, String>   | 호출할 api에 필요한 파라미터를 등록합니다. |
| responseType | Object                | Refactor 후 응답값 정의  |
| - key        | String                | 변환할 값              |
| - value      | String                | 변환 이후의 값           |


2. 복수 API 호출

### URL
| Http method	| URI                    |
|---|------------------------|
|POST| /api-refactor/apiUrls	 |

### Parameter

| value          | type                      | definition                |                     
|----------------|---------------------------|---------------------------| 
| urlList        | `List<String>`            | 호출할 api url list를 등록합니다   |
| headerList     | List<Map<String, String>> | 호출할 각 api에 필요한 헤더를 등록합니다. |
| queryParamList | List<Map<String, String>> | 호출할 api에 필요한 파라미터를 등록합니다. |
| responseType   | Object                    | Refactor 후 응답값 정의         |
| - key          | String                    | 변환할 값                     |
| - value        | String                    | 변환 이후의 값                  |

### 주의 사항
- 두 개 이상의 api를 호출할 경우, urlList, headerList, queryParamList의 index는 동일해야 합니다.
- 두 개 이상의 api에서 동일한 response key가 존재할 경우, 마지막에 호출된 api의 값으로 변환됩니다.
  - 추후, 해당 부분 사용자 정의에 알맞게 사용할 수 있도록 개선 예정