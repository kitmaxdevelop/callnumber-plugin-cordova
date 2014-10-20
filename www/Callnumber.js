/**
 * Created by giahoang on 10/17/14.
 */


if(!window.Call) window.Call = {};
window.Call = function(str, callback) {
    cordova.exec(
        callback,
        function(err) {
            callback('Nothing to function.');
        },
        "Callnumber",
        "Call",
        [str]
    );
};
