package life.majiang.community.controller;

import life.majiang.community.dto.AccessTokenDTO;
import life.majiang.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String callback(@RequestParam(name="code") String code ,
                           @RequestParam(name="state" )String state) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setClient_id("0832896d0a1596710a45");
        accessTokenDTO.setClient_secret("ae4f3a694d6b97946202c130607d62a07337f792");
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_ur("http://localhost:8887//callback");
        accessTokenDTO.setState(state);
        githubProvider.getAccessToken(accessTokenDTO);
        return "index";
    }

}
