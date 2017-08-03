package com.sconhillinfo.spring.store.datasources;

import org.elasticsearch.action.*;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteRequestBuilder;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.explain.ExplainRequest;
import org.elasticsearch.action.explain.ExplainRequestBuilder;
import org.elasticsearch.action.explain.ExplainResponse;
import org.elasticsearch.action.fieldcaps.FieldCapabilitiesRequest;
import org.elasticsearch.action.fieldcaps.FieldCapabilitiesRequestBuilder;
import org.elasticsearch.action.fieldcaps.FieldCapabilitiesResponse;
import org.elasticsearch.action.fieldstats.FieldStatsRequest;
import org.elasticsearch.action.fieldstats.FieldStatsRequestBuilder;
import org.elasticsearch.action.fieldstats.FieldStatsResponse;
import org.elasticsearch.action.get.*;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.*;
import org.elasticsearch.action.termvectors.*;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateRequestBuilder;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.AdminClient;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.Nullable;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.threadpool.ThreadPool;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ElasticSearchClient implements Client{

    @Override
    public AdminClient admin() {
        return null;
    }

    @Override
    public ActionFuture<IndexResponse> index(IndexRequest request) {
        return null;
    }

    @Override
    public void index(IndexRequest request, ActionListener<IndexResponse> listener) {

    }

    @Override
    public IndexRequestBuilder prepareIndex() {
        return null;
    }

    @Override
    public ActionFuture<UpdateResponse> update(UpdateRequest request) {
        return null;
    }

    @Override
    public void update(UpdateRequest request, ActionListener<UpdateResponse> listener) {

    }

    @Override
    public UpdateRequestBuilder prepareUpdate() {
        return null;
    }

    @Override
    public UpdateRequestBuilder prepareUpdate(String index, String type, String id) {
        return null;
    }

    @Override
    public IndexRequestBuilder prepareIndex(String index, String type) {
        return null;
    }

    @Override
    public IndexRequestBuilder prepareIndex(String index, String type, @Nullable String id) {
        return null;
    }

    @Override
    public ActionFuture<DeleteResponse> delete(DeleteRequest request) {
        return null;
    }

    @Override
    public void delete(DeleteRequest request, ActionListener<DeleteResponse> listener) {

    }

    @Override
    public DeleteRequestBuilder prepareDelete() {
        return null;
    }

    @Override
    public DeleteRequestBuilder prepareDelete(String index, String type, String id) {
        return null;
    }

    @Override
    public ActionFuture<BulkResponse> bulk(BulkRequest request) {
        return null;
    }

    @Override
    public void bulk(BulkRequest request, ActionListener<BulkResponse> listener) {

    }

    @Override
    public BulkRequestBuilder prepareBulk() {
        return null;
    }

    @Override
    public ActionFuture<GetResponse> get(GetRequest request) {
        return null;
    }

    @Override
    public void get(GetRequest request, ActionListener<GetResponse> listener) {

    }

    @Override
    public GetRequestBuilder prepareGet() {
        return null;
    }

    @Override
    public GetRequestBuilder prepareGet(String index, @Nullable String type, String id) {
        return null;
    }

    @Override
    public ActionFuture<MultiGetResponse> multiGet(MultiGetRequest request) {
        return null;
    }

    @Override
    public void multiGet(MultiGetRequest request, ActionListener<MultiGetResponse> listener) {

    }

    @Override
    public MultiGetRequestBuilder prepareMultiGet() {
        return null;
    }

    @Override
    public ActionFuture<SearchResponse> search(SearchRequest request) {
        return null;
    }

    @Override
    public void search(SearchRequest request, ActionListener<SearchResponse> listener) {

    }

    @Override
    public SearchRequestBuilder prepareSearch(String... indices) {
        return null;
    }

    @Override
    public ActionFuture<SearchResponse> searchScroll(SearchScrollRequest request) {
        return null;
    }

    @Override
    public void searchScroll(SearchScrollRequest request, ActionListener<SearchResponse> listener) {

    }

    @Override
    public SearchScrollRequestBuilder prepareSearchScroll(String scrollId) {
        return null;
    }

    @Override
    public ActionFuture<MultiSearchResponse> multiSearch(MultiSearchRequest request) {
        return null;
    }

    @Override
    public void multiSearch(MultiSearchRequest request, ActionListener<MultiSearchResponse> listener) {

    }

    @Override
    public MultiSearchRequestBuilder prepareMultiSearch() {
        return null;
    }

    @Override
    public ActionFuture<TermVectorsResponse> termVectors(TermVectorsRequest request) {
        return null;
    }

    @Override
    public void termVectors(TermVectorsRequest request, ActionListener<TermVectorsResponse> listener) {

    }

    @Override
    public TermVectorsRequestBuilder prepareTermVectors() {
        return null;
    }

    @Override
    public TermVectorsRequestBuilder prepareTermVectors(String index, String type, String id) {
        return null;
    }

    @Override
    public ActionFuture<TermVectorsResponse> termVector(TermVectorsRequest request) {
        return null;
    }

    @Override
    public void termVector(TermVectorsRequest request, ActionListener<TermVectorsResponse> listener) {

    }

    @Override
    public TermVectorsRequestBuilder prepareTermVector() {
        return null;
    }

    @Override
    public TermVectorsRequestBuilder prepareTermVector(String index, String type, String id) {
        return null;
    }

    @Override
    public ActionFuture<MultiTermVectorsResponse> multiTermVectors(MultiTermVectorsRequest request) {
        return null;
    }

    @Override
    public void multiTermVectors(MultiTermVectorsRequest request, ActionListener<MultiTermVectorsResponse> listener) {

    }

    @Override
    public MultiTermVectorsRequestBuilder prepareMultiTermVectors() {
        return null;
    }

    @Override
    public ExplainRequestBuilder prepareExplain(String index, String type, String id) {
        return null;
    }

    @Override
    public ActionFuture<ExplainResponse> explain(ExplainRequest request) {
        return null;
    }

    @Override
    public void explain(ExplainRequest request, ActionListener<ExplainResponse> listener) {

    }

    @Override
    public ClearScrollRequestBuilder prepareClearScroll() {
        return null;
    }

    @Override
    public ActionFuture<ClearScrollResponse> clearScroll(ClearScrollRequest request) {
        return null;
    }

    @Override
    public void clearScroll(ClearScrollRequest request, ActionListener<ClearScrollResponse> listener) {

    }

    @Override
    public FieldStatsRequestBuilder prepareFieldStats() {
        return null;
    }

    @Override
    public ActionFuture<FieldStatsResponse> fieldStats(FieldStatsRequest request) {
        return null;
    }

    @Override
    public void fieldStats(FieldStatsRequest request, ActionListener<FieldStatsResponse> listener) {

    }

    @Override
    public FieldCapabilitiesRequestBuilder prepareFieldCaps() {
        return null;
    }

    @Override
    public ActionFuture<FieldCapabilitiesResponse> fieldCaps(FieldCapabilitiesRequest request) {
        return null;
    }

    @Override
    public void fieldCaps(FieldCapabilitiesRequest request, ActionListener<FieldCapabilitiesResponse> listener) {

    }

    @Override
    public Settings settings() {
        return null;
    }

    @Override
    public Client filterWithHeader(Map<String, String> headers) {
        return null;
    }

    @Override
    public <Request extends ActionRequest, Response extends ActionResponse, RequestBuilder extends ActionRequestBuilder<Request, Response, RequestBuilder>> ActionFuture<Response> execute(Action<Request, Response, RequestBuilder> action, Request request) {
        return null;
    }

    @Override
    public <Request extends ActionRequest, Response extends ActionResponse, RequestBuilder extends ActionRequestBuilder<Request, Response, RequestBuilder>> void execute(Action<Request, Response, RequestBuilder> action, Request request, ActionListener<Response> listener) {

    }

    @Override
    public <Request extends ActionRequest, Response extends ActionResponse, RequestBuilder extends ActionRequestBuilder<Request, Response, RequestBuilder>> RequestBuilder prepareExecute(Action<Request, Response, RequestBuilder> action) {
        return null;
    }

    @Override
    public ThreadPool threadPool() {
        return null;
    }

    @Override
    public void close() {

    }
}
