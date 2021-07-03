(ns clojure-backend-challenge.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.json :refer :all :as json]
            [ring.util.response :refer [response]]
            [clojure-backend-challenge.query-user-type :refer :all]
            [clojure-backend-challenge.query-transaction :refer :all]
            [clojure-backend-challenge.query-user :refer :all]))

(defroutes app-routes
           (POST "/api/user/type" {:keys [params]}
             (response (add-user-type (get params "description"))))
           (POST "/api/user" {:keys [params]}
             (response (add-user (get params "user_uuid") (get params "user_type_id"))))
           (POST "/api/transaction" {:keys [params]}
             (response (add-transaction (get params "payer_id") (get params "payee_id") (get params "value"))))
           (route/not-found "Not Found"))

(def app
  (-> app-routes
      json/wrap-json-params
      json/wrap-json-response))
