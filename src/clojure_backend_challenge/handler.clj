(ns clojure-backend-challenge.handler
  (:require [compojure.core :refer :all]
            [ring.ring-defaults :as handler]
            [compojure.route :as route]
            [ring.middleware.json :as json]
            [ring.util.response :refer [response]]
            [clojure-backend-challenge.query-user-type :refer :all]
            [clojure-backend-challenge.query-transaction :refer :all]
            [clojure-backend-challenge.query-user :refer :all]))

(defroutes app-routes
           (POST "/api/user/type" {:keys [params]}
             (let [{:keys [description]} params]
               (response (add-user-type description))))
           (POST "/api/user" {:keys [params]}
             (let [{:keys [user_uuid user_type_id]} params]
               (response (add-user user_uuid user_type_id))))
           (POST "/api/transaction" {:keys [params]}
             (let [{:keys [payer_id payee_id value]} params]
               (response (add-transaction payer_id payee_id value))))
           (route/not-found "Not Found"))

(def app
  (-> (handler/api app-routes)
      (json/wrap-json-params)
      (json/wrap-json-response)))
