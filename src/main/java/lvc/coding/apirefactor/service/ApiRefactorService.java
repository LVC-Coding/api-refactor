package lvc.coding.apirefactor.service;

import lvc.coding.apirefactor.domain.MultiApiRequest;
import lvc.coding.apirefactor.domain.Response;
import lvc.coding.apirefactor.domain.SingleApiRequest;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiRefactorService {

    private final RestTemplate restTemplate;

    public ApiRefactorService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Response refactorSingleApi(SingleApiRequest singleApiRequest) {
        // 1. RestTemplate을 통핸 api 호출
        // 2. ResponseType에 따라서 response를 반환하는 로직을 구현
        return null;
    }

    public Response refactorMultiApiList(MultiApiRequest multiApiRequest) {
        // 1. RestTemplate을 통핸 api 호출
        // 2. ResponseType에 따라서 response를 반환하는 로직을 구현
        return null;
    }
}
