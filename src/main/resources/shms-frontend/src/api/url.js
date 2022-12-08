let _url;
let _domain
if (process.env.NODE_ENV == "development") {
    _domain = "127.0.0.1:8088"
    //本地开发
    _url = "http://" + _domain + "/api/"; //测试地址/
} else {
    _domain = "127.0.0.1:8088"
    //本地开发
    _url = "http://" + _domain + "/api/"; //线上地址
}
export const domain = _domain;
export const url = _url;