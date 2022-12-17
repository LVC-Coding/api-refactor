package lvc.coding.apirefactor.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lvc.coding.apirefactor.domain.MultiApiRequest;
import lvc.coding.apirefactor.domain.Response;
import lvc.coding.apirefactor.domain.SingleApiRequest;
import lvc.coding.apirefactor.service.ApiRefactorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = {"ApiRefactorController"})
public class ApiRefactorController {

    @Autowired
    private ApiRefactorService apiRefactorService;

    @GetMapping("/test")
    @ApiOperation(value = "test", notes = "test")
    public String test() {
        return "test";
    }

    @ApiOperation("Refactor single api")
    @PostMapping("/api-refactor/apiUrl")
    public Response refactorSingleApi(@RequestBody SingleApiRequest singleApiRequest) {
        return apiRefactorService.refactorSingleApi(singleApiRequest);
    }

    @ApiOperation("Refactor multi api")
    @PostMapping("/api-refactor/apiUrls")
    public Response refactorMultiApiList(@RequestBody MultiApiRequest multiApiRequest) {
        return apiRefactorService.refactorMultiApiList(multiApiRequest);
    }
}
