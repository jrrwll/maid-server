package org.dreamcat.maid.api.service;

import org.dreamcat.common.web.core.RestBody;
import org.dreamcat.maid.api.controller.file.FileInfoView;
import org.dreamcat.maid.api.controller.file.FileItemView;
import org.dreamcat.maid.api.controller.file.FileView;
import org.springframework.web.server.ServerWebExchange;

import java.util.List;
import java.util.Map;

/**
 * Create by tuke on 2020/2/6
 */
public interface FileService {

    // file
    RestBody<FileInfoView> file(long fid, ServerWebExchange exchange);

    // ls -lh
    RestBody<List<FileItemView>> list(long pid, ServerWebExchange exchange);

    // tree
    RestBody<FileView> tree(long pid, int level, ServerWebExchange exchange);

    // path  -->  items
    RestBody<Map<String, List<FileItemView>>> flatTree(long pid, ServerWebExchange exchange);

}
